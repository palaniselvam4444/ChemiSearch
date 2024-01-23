package com.deena.chemisearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button btn;
    ImageView cs;

    TextView vs;
    TextView par;
    TextView stp;
    TextView en;
    TextView vas;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar and action bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_main);



        btn =findViewById(R.id.button);
        Button search = findViewById(R.id.button);
        search.setOnClickListener(v -> {



            Intent intent = new Intent(this, HamamSoap.class);
            startActivity(intent);
        });


        ImageView cs = findViewById(R.id.cs);

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), headnshoulders.class);
                startActivity(intent);
            }
        });



        edt = findViewById(R.id.searchbox);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.getText().clear();
            }
        });

        TextView vs = findViewById(R.id.textView4);

        vs.setOnClickListener(v -> {

            Intent intent = new Intent(this, vicks.class);
            startActivity(intent);
        });

        TextView par = findViewById(R.id.textView14);

        par.setOnClickListener(v -> {

            Intent intent = new Intent(this, paracetamol.class);
            startActivity(intent);
        });

        TextView stp = findViewById(R.id.textView15);

        stp.setOnClickListener(v -> {

            Intent intent = new Intent(this, strepsils.class);
            startActivity(intent);
        });


        TextView en = findViewById(R.id.textView16);

        en.setOnClickListener(v -> {

            Intent intent = new Intent(this, eno.class);
            startActivity(intent);
        });


        TextView vas = findViewById(R.id.textView17);

        vas.setOnClickListener(v -> {

            Intent intent = new Intent(this, vaseline.class);
            startActivity(intent);
        });













    }
}