package com.example.thomd.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class Pioche extends AppCompatActivity {

    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pioche);

        RelativeLayout cpioche = findViewById(R.id.pioche);
        int fond = getIntent().getIntExtra("colorInt", 0);

        Log.d("CODE", "Information");

        //récupération du paramètre
        String colorCase = getIntent().getStringExtra("color");
        Toast.makeText(getApplicationContext(),"C O U L E U R    " + colorCase, Toast.LENGTH_LONG).show();

        Log.d("CODE", "colorCase");

        if(colorCase.equals("V E R T"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_vert));
        }
        if(colorCase.equals("O R A N G E"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_orange));
        }
        if(colorCase.equals("R O U G E"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_rouge));
        }
        if(colorCase.equals("N O I R"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_noir));
        }
    }
}
