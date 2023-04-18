package com.example.hyggeprojekt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

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