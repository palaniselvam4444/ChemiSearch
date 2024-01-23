package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class HamamSoap extends AppCompatActivity {

    TextView gly;
    TextView sod;
    TextView tal;
    TextView nacl;
    TextView hyd;
    TextView seed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_hamam_soap);


        TextView gly = findViewById(R.id.textView5);

        gly.setOnClickListener(v -> {

            Intent intent = new Intent(this, Glycerin.class);
            startActivity(intent);
        });

        TextView sod = findViewById(R.id.textView6);

        sod.setOnClickListener(v -> {

            Intent intent = new Intent(this, sodium_palmate.class);
            startActivity(intent);
        });

        TextView tal = findViewById(R.id.textView7);

        tal.setOnClickListener(v -> {

            Intent intent = new Intent(this, talc.class);
            startActivity(intent);
        });

        TextView nacl = findViewById(R.id.textView8);

        nacl.setOnClickListener(v -> {

            Intent intent = new Intent(this, sodiumcl.class);
            startActivity(intent);
        });


        TextView hyd = findViewById(R.id.textView9);

        hyd.setOnClickListener(v -> {

            Intent intent = new Intent(this, Hydroxycitronellal.class);
            startActivity(intent);
        });


        TextView seed = findViewById(R.id.textView10);

        seed.setOnClickListener(v -> {

            Intent intent = new Intent(this, seedoil.class);
            startActivity(intent);
        });


    }
}