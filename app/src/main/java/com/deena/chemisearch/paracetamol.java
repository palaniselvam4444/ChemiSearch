package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class paracetamol extends AppCompatActivity {


    TextView par;
    TextView ms;
    TextView ps;
    TextView t;
    TextView sa;
    TextView p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_paracetamol);

        TextView par = findViewById(R.id.textView5);

        par.setOnClickListener(v -> {

            Intent intent = new Intent(this, Paracetamol2.class);
            startActivity(intent);
        });

        TextView ms = findViewById(R.id.textView6);

        ms.setOnClickListener(v -> {

            Intent intent = new Intent(this, Maize_Starch.class);
            startActivity(intent);
        });

        TextView ps = findViewById(R.id.textView7);

        ps.setOnClickListener(v -> {

            Intent intent = new Intent(this, Potassium_Sorbate.class);
            startActivity(intent);
        });

        TextView t = findViewById(R.id.textView8);

        t.setOnClickListener(v -> {

            Intent intent = new Intent(this, Talc_2.class);
            startActivity(intent);
        });

        TextView sa = findViewById(R.id.textView9);

        sa.setOnClickListener(v -> {

            Intent intent = new Intent(this, Stearic_Acid.class);
            startActivity(intent);
        });

        TextView p = findViewById(R.id.textView10);

        p.setOnClickListener(v -> {

            Intent intent = new Intent(this, Povidone.class);
            startActivity(intent);
        });





    }
}