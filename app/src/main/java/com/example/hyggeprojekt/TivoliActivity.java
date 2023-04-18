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

import java.util.Map;

public class TivoliActivity extends AppCompatActivity {
    private static final String TAG = "TivoliActivity";
    TextView tivoliPictureId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tivoli_activity);

        tivoliPictureId = (TextView) findViewById(R.id.tivoliInfoId);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("Tivoli").get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    // Iterate over the documents in the query result
                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                        // Get the data as a Map
                        Map<String, Object> data = document.getData();
                        // Do something with the data
                        String name = (String) data.get("Name");
                        String address = (String) data.get("Adresse");
                        Log.d(TAG, "Tivoli Address: " + address);
                        Log.d(TAG, "Tivoli Name: " + name);
                        tivoliPictureId.setText(name);
                        tivoliPictureId.setText(address);

                    }
                })
                .addOnFailureListener(e -> {
                    // Handle errors here
                });


    }
}