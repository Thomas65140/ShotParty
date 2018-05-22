package com.example.thomd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Pioche extends AppCompatActivity {

    int v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pioche);

        //récupération du paramètre
        String colorCase = getIntent().getStringExtra("color");
        Toast.makeText(getApplicationContext(),"Couleur" + colorCase, Toast.LENGTH_LONG).show();


    }
}
