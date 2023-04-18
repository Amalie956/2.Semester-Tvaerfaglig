package com.example.hyggeprojekt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TivoliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tivoli_activity);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("tivoli")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                System.out.println(document.getData());
                                System.out.println("document.getData()");
                                System.out.println(document.getData());
                                System.out.println(document.getData());
                                System.out.println(document.getData());
                            }
                        } else {
                            System.out.println(task.getException());
                        }
                    }
                });
    }
}