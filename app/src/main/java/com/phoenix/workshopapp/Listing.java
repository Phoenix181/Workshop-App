package com.phoenix.workshopapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class Listing extends AppCompatActivity {

    ImageView prodBtn, prodBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        prodBtn = findViewById(R.id.product);
        prodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent product = new Intent(Listing.this, ProductActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("str_key", "real string from Listing");
                product.putExtra("key_bundle", bundle);
                startActivity(product);
            }
        });

        prodBtn2 = findViewById(R.id.product1);
        prodBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent product = new Intent();
                String textMessage = "Hello, friend!";
                product.setAction(Intent.ACTION_SEND);
                product.putExtra(Intent.EXTRA_TEXT, textMessage);
                product.setType("text/plain");

                if (product.resolveActivity(getPackageManager()) != null) {
                    startActivity(product);
                }
            }
        });
    }

}
