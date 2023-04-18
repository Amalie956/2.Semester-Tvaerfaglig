package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.Map;

public class HotDrinksActivity extends AppCompatActivity {

    private static final String TAG = "HyggeAtHomeActivity";
    StringBuilder dataBuilder = new StringBuilder();

    TextView hotDrinkId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_drinks_activity);

        hotDrinkId = (TextView) findViewById(R.id.hotDrinkId);

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        db.collection("Hot drink").get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                        // Get the data as a Map
                        Map<String, Object> data = document.getData();
                        // Gets the data from "Restaurant"-collection
                        String name = (String) data.get("Name");
                        String brand = (String) data.get("Brand");
                        String reason = (String) data.get("Reason");

                        Log.d(TAG, "Hot drink Name: " + name);


                        // concatenates the data points into a single string and then sets the text of our TextView to that string.
                        dataBuilder.append(name).append("\n").append("\n").append(brand).append("\n").append("\n").append(reason).append("\n");

                    }
                    // Displays multiple Data points (in our case: name and address)
                    hotDrinkId.setText(dataBuilder.toString());
                })
                .addOnFailureListener(e -> {
                    // Handle errors here
                });

    }
}