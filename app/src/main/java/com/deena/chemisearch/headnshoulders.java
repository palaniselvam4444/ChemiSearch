package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class headnshoulders extends AppCompatActivity {

    TextView pz;
    TextView gly;
    TextView zc;
    TextView ca;
    TextView sd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_headnshoulders);

        TextView gly = findViewById(R.id.textView7);

        gly.setOnClickListener(v -> {

            Intent intent = new Intent(this, Glycerin.class);
            startActivity(intent);
        });

        TextView pz = findViewById(R.id.textView5);

        pz.setOnClickListener(v -> {

            Intent intent = new Intent(this, Pyrithione_zinc.class);
            startActivity(intent);
        });

        TextView ca = findViewById(R.id.textView9);

        ca.setOnClickListener(v -> {

            Intent intent = new Intent(this, Cetyl_acl.class);
            startActivity(intent);
        });

        TextView sd = findViewById(R.id.textView8);

        sd.setOnClickListener(v -> {

            Intent intent = new Intent(this, sd.class);
            startActivity(intent);
        });

        TextView zc = findViewById(R.id.textView6);

        zc.setOnClickListener(v -> {

            Intent intent = new Intent(this, zincc.class);
            startActivity(intent);
        });

    }
}