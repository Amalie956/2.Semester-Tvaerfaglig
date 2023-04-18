package com.example.hyggeprojekt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.BreakIterator;
import java.util.Map;

public class TivoliActivity extends AppCompatActivity {
    private static final String TAG = "TivoliActivity";
    StringBuilder dataBuilder = new StringBuilder();
    TextView tivoliInfoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tivoli_activity);

        tivoliInfoId = (TextView) findViewById(R.id.tivoliInfoId);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("Tivoli").get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                        // Get the data as a Map
                        Map<String, Object> data = document.getData();
                        // Gets the data from "Tivoli"-collection
                        String name = (String) data.get("Name");
                        String description = (String) data.get("Description");
                        String openingHours = (String) data.get("Opening hours");
                        String address = (String) data.get("Adresse");

                        Log.d(TAG, "Tivoli Name: " + name);


                        // concatenates the data points into a single string and then sets the text of our TextView to that string.
                        dataBuilder.append(name).append("\n").append("\n").append(description).append("\n").append("\n").append(openingHours).append("\n").append("\n").append(address).append("\n");

                    }
                    // Displays multiple Data points (in our case: name and address)
                    tivoliInfoId.setText(dataBuilder.toString());
                })
                .addOnFailureListener(e -> {
                    // Handle errors here
                });


    }
}