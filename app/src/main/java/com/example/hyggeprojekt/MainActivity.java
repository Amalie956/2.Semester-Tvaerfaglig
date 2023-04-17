package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button informationAboutHyggeButton;
    public Button hyggeActivitiesInCopenhagen;
    public Button hyggeActivitiesAtHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        informationAboutHyggeButton = (Button) findViewById(R.id.InfoAboutHyggeButtonID);
        hyggeActivitiesInCopenhagen = (Button) findViewById(R.id.ActivitiesInCopenhagenButtonID);
        hyggeActivitiesAtHome = (Button) findViewById(R.id.HyggeActivitiesAtHomeID);
        informationAboutHyggeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        hyggeActivitiesInCopenhagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        hyggeActivitiesAtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }

}