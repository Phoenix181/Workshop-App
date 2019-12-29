package com.phoenix.workshopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    TextView simpleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        simpleText = findViewById(R.id.sim_text);
        Bundle recBundle = getIntent().getBundleExtra("key_bundle");
        String rectext = recBundle.getString("str_key");

        simpleText.setText(rectext);
    }
}
