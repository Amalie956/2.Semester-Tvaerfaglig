package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HyggeAtHomeActivities extends AppCompatActivity {
    public ImageView ActivityHotChocolate;
    public ImageView ActivitySocks;
    public ImageView ActivityTwoFemales;
    public ImageView ActivityBathub;
    public ImageView ActivityLighting;
    public ImageView ActivitySofa;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hygge_at_home_activities);

        ActivityHotChocolate = (ImageView) findViewById(R.id.hotchocolatePictureID);
        ActivitySocks = (ImageView) findViewById(R.id.socksPictureID);
        ActivityTwoFemales = (ImageView) findViewById(R.id.twoFemalesPictureID);
        ActivityBathub = (ImageView) findViewById(R.id.bathubPictureID);
        ActivityLighting = (ImageView) findViewById(R.id.lightingPictureID);
        ActivitySofa = (ImageView) findViewById(R.id.sofaPictureID);

        ActivityHotChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, HotDrinksActivity.class);
                startActivity(intent);
            }
        });

        ActivitySocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, ComfortableClothesSocksActivity.class);
                startActivity(intent);
            }
        });

        ActivityTwoFemales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, FriendsActivity.class);
                startActivity(intent);
            }
        });

        ActivityBathub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, HomeCareBathtubActivity.class);
                startActivity(intent);
            }
        });

        ActivityLighting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, LightingActivity.class);
                startActivity(intent);
            }
        });

        ActivitySofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeAtHomeActivities.this, RelaxOnSofaActivity.class);
                startActivity(intent);
            }
        });
    }
}