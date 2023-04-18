package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.Map;

public class ComfortableClothesSocksActivity extends AppCompatActivity {

    private static final String TAG = "Cozy Loungewear";
    StringBuilder dataBuilder = new StringBuilder();

    TextView cozyLoungewearId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comfortable_clothes_socks_activity);

        cozyLoungewearId = (TextView) findViewById(R.id.cozyLoungewearId);

        FirebaseFirestore db = FirebaseFirestore.getInstance();


        db.collection("Cozy loungewear").get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                        // Get the data as a Map
                        Map<String, Object> data = document.getData();
                        // Gets the data from "Restaurant"-collection
                        String type = (String) data.get("Type");
                        String reason = (String) data.get("Reason");

                        Log.d(TAG, "Cozy loungewear: " + type);


                        // concatenates the data points into a single string and then sets the text of our TextView to that string.
                        dataBuilder.append(type).append("\n").append("\n").append(reason).append("\n");

                    }
                    // Displays multiple Data points (in our case: name and address)
                    cozyLoungewearId.setText(dataBuilder.toString());
                })
                .addOnFailureListener(e -> {
                    // Handle errors here
                });



    }




}