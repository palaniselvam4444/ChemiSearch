package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class vaseline extends AppCompatActivity {

    TextView mo;
    TextView ce;
    TextView la;
    TextView pa;
    TextView gy;
    TextView bi;
    ImageView vas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_vaseline);





        ImageView vase = findViewById(R.id.vase);

        vase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), lpp.class);
                startActivity(intent);
                Toast.makeText(vaseline.this, "Love Plus Plus Unlocked !", Toast.LENGTH_SHORT).show();
            }
        });



        TextView mo = findViewById(R.id.textView5);

        mo.setOnClickListener(v -> {

            Intent intent = new Intent(this, Mineral_oil.class);
            startActivity(intent);
        });

        TextView ce = findViewById(R.id.textView6);

        ce.setOnClickListener(v -> {

            Intent intent = new Intent(this, Ceresin.class);
            startActivity(intent);
        });

        TextView la = findViewById(R.id.textView7);

        la.setOnClickListener(v -> {

            Intent intent = new Intent(this, Lanolin_alcohol.class);
            startActivity(intent);
        });


        TextView pa = findViewById(R.id.textView8);

        pa.setOnClickListener(v -> {

            Intent intent = new Intent(this, Panthenol.class);
            startActivity(intent);
        });

        TextView gy = findViewById(R.id.textView9);

        gy.setOnClickListener(v -> {

            Intent intent = new Intent(this, Glycerin.class);
            startActivity(intent);
        });

        TextView bi = findViewById(R.id.textView10);

        bi.setOnClickListener(v -> {

            Intent intent = new Intent(this, Bisabolol.class);
            startActivity(intent);
        });










    }
}