package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class eno extends AppCompatActivity {

    TextView sc;
    TextView sb;
    TextView ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_eno);

        TextView sc = findViewById(R.id.textView5);

        sc.setOnClickListener(v -> {

            Intent intent = new Intent(this, Sodium_carbonate.class);
            startActivity(intent);
        });


        TextView sb = findViewById(R.id.textView6);

        sb.setOnClickListener(v -> {

            Intent intent = new Intent(this, Sodium_bicarbonate.class);
            startActivity(intent);
        });

        TextView ca = findViewById(R.id.textView7);

        ca.setOnClickListener(v -> {


            Intent intent = new Intent(this, Citric_acid.class);
            startActivity(intent);
        });


    }
}