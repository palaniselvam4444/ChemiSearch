package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class vicks extends AppCompatActivity {


    TextView cam;
    TextView eul;
    TextView ment;
    TextView to;
    TextView thy;
    TextView pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_vicks);

        TextView cam = findViewById(R.id.textView5);

        cam.setOnClickListener(v -> {

            Intent intent = new Intent(this, camphor.class);
            startActivity(intent);
        });

        TextView eul = findViewById(R.id.textView6);

        eul.setOnClickListener(v -> {

            Intent intent = new Intent(this, eucalyptus_oil.class);
            startActivity(intent);
        });

        TextView ment = findViewById(R.id.textView7);

        ment.setOnClickListener(v -> {

            Intent intent = new Intent(this, menthol.class);
            startActivity(intent);
        });

        TextView to = findViewById(R.id.textView8);

        to.setOnClickListener(v -> {

            Intent intent = new Intent(this, turpentine_oil.class);
            startActivity(intent);
        });

        TextView thy = findViewById(R.id.textView9);

        thy.setOnClickListener(v -> {

            Intent intent = new Intent(this, thymol.class);
            startActivity(intent);
        });

        TextView pet = findViewById(R.id.textView10);

        pet.setOnClickListener(v -> {

            Intent intent = new Intent(this, Petrolataum.class);
            startActivity(intent);
        });



    }
}