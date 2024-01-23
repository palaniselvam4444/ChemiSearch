package com.deena.chemisearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class strepsils extends AppCompatActivity {

    TextView da;
    TextView am;
    TextView me;
    TextView ta;
    TextView pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_strepsils);

        TextView da = findViewById(R.id.textView5);

        da.setOnClickListener(v -> {

            Intent intent = new Intent(this, dichlorobenzyl_alcohol.class);
            startActivity(intent);
        });

        TextView am = findViewById(R.id.textView6);

        am.setOnClickListener(v -> {

            Intent intent = new Intent(this, Amylmetacresol.class);
            startActivity(intent);
        });

        TextView me = findViewById(R.id.textView7);

        me.setOnClickListener(v -> {

            Intent intent = new Intent(this, menthol.class);
            startActivity(intent);
        });

        TextView ta = findViewById(R.id.textView8);

        ta.setOnClickListener(v -> {

            Intent intent = new Intent(this, Tartaric_Acid.class);
            startActivity(intent);
        });


        TextView pg = findViewById(R.id.textView9);

        pg.setOnClickListener(v -> {

            Intent intent = new Intent(this, Propylene_glycol.class);
            startActivity(intent);
        });






    }
}