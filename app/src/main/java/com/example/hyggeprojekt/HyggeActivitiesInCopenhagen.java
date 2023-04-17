package com.example.hyggeprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HyggeActivitiesInCopenhagen extends AppCompatActivity {
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
        setContentView(R.layout.hygge_activities_in_copenhagen);

        ActivityTivoli = (ImageView) findViewById(R.id.tivoliPictureID);
        ActivityRestaurant = (ImageView) findViewById(R.id.restaurantPictureID);
        ActivitNature = (ImageView) findViewById(R.id.naturePictureID);
        ActivityCafe = (ImageView) findViewById(R.id.cafePictureID);
        ActivityAmalienborg = (ImageView) findViewById(R.id.amalienborgPictureID);
        ActivityZoo = (ImageView) findViewById(R.id.zooPictureID);


        ActivityTivoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, TivoliActivity.class);
                startActivity(intent);
            }
        });

        ActivityRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });

        ActivitNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, NatureActivity.class);
                startActivity(intent);
            }
        });

        ActivityCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, CafeActivity.class);
                startActivity(intent);
            }
        });
        ActivityAmalienborg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, AmalienborgActivity.class);
                startActivity(intent);
            }
        });

        ActivityZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HyggeActivitiesInCopenhagen.this, ZooActivity.class);
                startActivity(intent);
            }
        });
    }
}