package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.Map;

public class RestaurantActivity extends AppCompatActivity {

    private static final String TAG = "RestaurantActivity";
    StringBuilder dataBuilder = new StringBuilder();

    TextView restaurantInfoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_activity);

        restaurantInfoId = (TextView) findViewById(R.id.restaurantInfoId);

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        db.collection("Restaurant").get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                        // Get the data as a Map
                        Map<String, Object> data = document.getData();
                        // Gets the data from "Restaurant"-collection
                        String name = (String) data.get("Name");
                        String description = (String) data.get("Description");
                        String openingHours = (String) data.get("Opening hours");
                        String address = (String) data.get("Address");

                        Log.d(TAG, "Restaurant Name: " + name);


                        // concatenates the data points into a single string and then sets the text of our TextView to that string.
                        dataBuilder.append(name).append("\n").append("\n").append(description).append("\n").append("\n").append(openingHours).append("\n").append("\n").append(address).append("\n");

                    }
                    // Displays multiple Data points (in our case: name and address)
                    restaurantInfoId.setText(dataBuilder.toString());
                })
                .addOnFailureListener(e -> {
                    // Handle errors here
                });


    }
}