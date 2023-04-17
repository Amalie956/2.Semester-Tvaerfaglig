package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    public ImageView ActivityTivoli;
    public ImageView ActivityRestaurant;
    public ImageView ActivitNature;
    public ImageView ActivityCafe;
    public ImageView ActivityAmalienborg;
    public ImageView ActivityZoo;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ActivityTivoli = (ImageView) findViewById(R.id.tivoliPictureID);
        ActivityRestaurant = (ImageView) findViewById(R.id.restaurantPictureID);
        ActivitNature = (ImageView) findViewById(R.id.naturePictureID);
        ActivityCafe = (ImageView) findViewById(R.id.cafePictureID);
        ActivityAmalienborg = (ImageView) findViewById(R.id.amalienborgPictureID);
        ActivityZoo = (ImageView) findViewById(R.id.zooPictureID);


        ActivityTivoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        ActivityRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        ActivitNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        ActivityCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        ActivityAmalienborg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        ActivityZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}