package com.example.thomd.myapplication;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.security.AccessController.getContext;

public class Pioche extends AppCompatActivity {

    int r;
    String messageRdm = "";
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bouton_prochain_joueur;
    TextView message_Rdm;
    Button bouton_exit;
    TextView Annuler, Question;

    Random hNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pioche);

        RelativeLayout cpioche = findViewById(R.id.pioche);
        int fond = getIntent().getIntExtra("colorInt", 0);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);

        //Log.d("CODE", "Information");

        //Nombre aleatoire
        hNombre = new Random();

        //récupération du paramètre
        String colorCase = getIntent().getStringExtra("color");
        Toast.makeText(getApplicationContext(),"C O U L E U R    " + colorCase, Toast.LENGTH_LONG).show();

        //Log.d("CODE", "colorCase");

        if(colorCase.equals("V E R T"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_vert));

            switch(hNombre.nextInt(140))
            {
                // Bois 1G x35 ------------------------------------------------------------------------

                case 0 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 1 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 2 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 3 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 4 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 5 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 6 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 7 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 8 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 9 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 10 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 11 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 12 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 13 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 14 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 15 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 16 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 17 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 18 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 19 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 20 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 21 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 22 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 23 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 24 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 25 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 26 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 27 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 28 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 29 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 30 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 31 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 32 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 33 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 34 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                // Bois 2G x30 ------------------------------------------------------------------------

                case 35 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 36 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 37 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 38 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 39 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 40 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 41 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 42 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 43 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 44 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 45 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 46 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 47 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 48 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 49 :
                    messageRdm = getResources().getString(R.string.b1);
                    break;

                case 50 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 51 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 52 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 53 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 54 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 55 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 56 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 57 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 58 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 59 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 60 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 61 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 62 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 63 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 64 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                // Bois 3G x12 --------------------------------------------------------------------

                case 65 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 66 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 67 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 68 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 69 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 70 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 71 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 72 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 73 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 74 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 75 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 76 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 77 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 78 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 79 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 80 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 81 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 82 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 83 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 84 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 85 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 86 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 87 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 88 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 89 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 90 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 91 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 92 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 93 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 94 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 95 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 96 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 97 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 98 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 99 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 100 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 101 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 102 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 103 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 104 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 105 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 106 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 107 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 108 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 109 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 110 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 111 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 112 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 113 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 114 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 115 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 116 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 117 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 118 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 119 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 120 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 121 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 122 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 123 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 124 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 125 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 126 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 127 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 128 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 129 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 130 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 131 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 132 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 133 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 134 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 135 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 136 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 137 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 138 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 139 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;
            }
        }
        if(colorCase.equals("O R A N G E"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_orange));

            switch(hNombre.nextInt(140))
            {
                // Bois 1G x6 -------------------------------------------------------------------------

                case 0 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 1 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 2 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 3 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 4 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 5 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                // Bois 2G x30 -------------------------------------------------------------------------

                case 6 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 7 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 8 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 9 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 10 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 11 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 12 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 13 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 14 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 15 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 16 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 17 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 18 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 19 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 20 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 21 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 22 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 23 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 24 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 25 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 26 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 27 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 28 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 29 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 30 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 31 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 32 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 33 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 34 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 35 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                // Bois 3G x35 ------------------------------------------------------------------------

                case 36 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 37 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 38 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 39 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 40 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 41 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 42 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 43 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 44 :
                    messageRdm = getResources().getString(R.string.b2);
                    break;

                case 45 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 46 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 47 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 48 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 49 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 50 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 51 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 52 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 53 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 54 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 55 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 56 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 57 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 58 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 59 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 60 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 61 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 62 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 63 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 64 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                // Bois 3G x12 --------------------------------------------------------------------

                case 65 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 66 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 67 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 68 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 69 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 70 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                // Bois 4G x14 -------------------------------------------------------------------------

                case 71 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 72 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 73 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 74 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 75 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 76 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 77 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 78 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 79 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 80 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 81 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 82 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 83 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 84 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 85 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 86 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 87 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 88 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 89 :
                    messageRdm = getResources().getString(R.string.b3 );
                    break;

                case 90 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 91 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 92 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 93 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 94 :
                    messageRdm = getResources().getString(R.string.b3);
                    break;

                case 95 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 96 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 97 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 98 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 99 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 100 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 101 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 102 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 103 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 104 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 105 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 106 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 107 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 108 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 109 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 110 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 111 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 112 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 113 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 114 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 115 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 116 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 117 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 118 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 119 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 120 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 121 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 122 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 123 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 124 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 125 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 126 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 127 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 128 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 129 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 130 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 131 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 132 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 133 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 134 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 135 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 136 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 137 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 138 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 139 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;
            }
        }
        if(colorCase.equals("R O U G E"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_rouge));

            switch(hNombre.nextInt(141))
            {
                // Bois 1G x3 -------------------------------------------------------------------------

                case 0 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 1 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 2 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 3 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 4 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 5 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 6 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 7 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 8 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 9 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 10 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 11 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 12 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 13 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 14 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 15 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 16 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 17 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 18 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 19 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 20 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 21 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 22 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 23 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 24 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 25 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 26 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 27 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 28 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 29 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 30 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 31 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 32 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 33 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 34 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                // Bois 2G x30 ------------------------------------------------------------------------

                case 35 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 36 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 37 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 38 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 39 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 40 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 41 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 42 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 43 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 44 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 45 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 46 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 47 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 48 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 49 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 50 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 51 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 52 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 53 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 54 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 55 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 56 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 57 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 58 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 59 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 60 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 61 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 62 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 63 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 64 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                // Bois 3G x12 --------------------------------------------------------------------

                case 65 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 66 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 67 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 68 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 69 :
                    messageRdm = getResources().getString(R.string.b4);
                    break;

                case 70 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 71 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 72 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 73 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 74 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 75 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 76 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 77 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 78 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 79 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 80 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 81 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 82 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 83 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 84 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 85 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 86 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 87 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 88 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 89 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 90 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 91 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 92 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 93 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 94 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 95 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 96 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 97 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 98 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 99 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 100 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 101 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 102 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 103 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 104 :
                    messageRdm = getResources().getString(R.string.d1);
                    break;

                case 105 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 106 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 107 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 108 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 109 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 110 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 111 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 112 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 113 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 114 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 115 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 116 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 117 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 118 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 119 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 120 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 121 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 122 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 123 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 124 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 125 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 126 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 127 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 128 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 129 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 130 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 131 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 132 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 133 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 134 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 135 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 136 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 137 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 138 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 139 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 140 :
                    Gages gages = new Gages();
                    messageRdm = gages.getGages(Gage);
                    break;
            }
        }
        if(colorCase.equals("N O I R"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_noir));

            switch(hNombre.nextInt(140))
            {
                // Bois 1G x1 -------------------------------------------------------------------------

                case 0 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 1 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 2 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 3 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 4 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 5 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 6 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 7 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 8 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 9 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 10 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 11 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 12 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 13 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 14 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 15 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 16 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 17 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 18 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 19 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 20 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 21 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 22 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 23 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 24 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 25 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 26 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 27 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 28 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 29 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 30 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 31 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 32 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 33 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 34 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                // Bois 2G x30 ------------------------------------------------------------------------

                case 35 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 36 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 37 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 38 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 39 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 40 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 41 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 42 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 43 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 44 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 45 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 46 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 47 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 48 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 49 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 50 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 51 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 52 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 53 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 54 :
                    messageRdm = getResources().getString(R.string.b5);
                    break;

                case 55 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 56 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 57 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 58 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 59 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 60 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 61 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 62 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 63 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 64 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                // Bois 3G x12 --------------------------------------------------------------------

                case 65 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 66 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 67 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 68 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 69 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 70 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 71 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 72 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 73 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 74 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 75 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 76 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 77 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 78 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 79 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 80 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 81 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 82 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 83 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 84 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 85 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 86 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 87 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 88 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 89 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 90 :
                    messageRdm = getResources().getString(R.string.b6);
                    break;

                case 91 :
                    messageRdm = getResources().getString(R.string.b7);
                    break;

                case 92 :
                    messageRdm = getResources().getString(R.string.b7);
                    break;

                case 93 :
                    messageRdm = getResources().getString(R.string.b7);
                    break;

                case 94 :
                    messageRdm = getResources().getString(R.string.b8);
                    break;

                case 95 :
                    messageRdm = getResources().getString(R.string.b8);
                    break;

                case 96 :
                    messageRdm = getResources().getString(R.string.b8);
                    break;

                case 97 :
                    messageRdm = getResources().getString(R.string.b9);
                    break;

                case 98 :
                    messageRdm = getResources().getString(R.string.b9);
                    break;

                case 99 :
                    messageRdm = getResources().getString(R.string.b9);
                    break;

                case 100 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 101 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 102 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 103 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 104 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 105 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 106 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 107 :
                    messageRdm = getResources().getString(R.string.d2);
                    break;

                case 108 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 109 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 110 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 111 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 112 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 113 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 114 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 115 :
                    messageRdm = getResources().getString(R.string.d3);
                    break;

                case 116 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 117 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 118 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 119 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 120 :
                    messageRdm = getResources().getString(R.string.d4);
                    break;

                case 121 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 122 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 123 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 124 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 125 :
                    messageRdm = getResources().getString(R.string.d5);
                    break;

                case 126 :
                    messageRdm = getResources().getString(R.string.d6);
                    break;

                case 127 :
                    messageRdm = getResources().getString(R.string.d6);
                    break;

                case 128 :
                    messageRdm = getResources().getString(R.string.d6);
                    break;

                case 129 :
                    messageRdm = getResources().getString(R.string.d6);
                    break;

                case 130 :
                    messageRdm = getResources().getString(R.string.d7);
                    break;

                case 131 :
                    messageRdm = getResources().getString(R.string.d7);
                    break;

                case 132 :
                    messageRdm = getResources().getString(R.string.d7);
                    break;

                case 133 :
                    messageRdm = getResources().getString(R.string.c1);
                    break;

                case 134 :
                    messageRdm = getResources().getString(R.string.c1);
                    break;

                case 135 :
                    messageRdm = getResources().getString(R.string.c2);
                    break;

                case 136 :
                    messageRdm = getResources().getString(R.string.c2);
                    break;

                case 137 :
                    messageRdm = getResources().getString(R.string.c3);
                    break;

                case 138 :
                    messageRdm = getResources().getString(R.string.c3);
                    break;

                case 139 :
                    messageRdm = getResources().getString(R.string.c4);
                    break;
            }
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b1.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b2.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b3.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b4.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b5.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b6.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b7.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b8.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b9.startAnimation(animation);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Pioche.this);
                View mView = getLayoutInflater().inflate(R.layout.message_bouton, null);
                mBuilder.setCancelable(false);
                String colorCase = getIntent().getStringExtra("color");

                bouton_prochain_joueur = (Button) mView.findViewById(R.id.bouton_prochain_joueur);
                message_Rdm = (TextView) mView.findViewById(R.id.message_random);

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                    message_Rdm.setTextColor(getResources().getColor(R.color.green));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                    message_Rdm.setTextColor(getResources().getColor(R.color.orange));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                    message_Rdm.setTextColor(getResources().getColor(R.color.red));
                    message_Rdm.setText(messageRdm);
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
                    message_Rdm.setTextColor(getResources().getColor(R.color.black));
                    message_Rdm.setText(messageRdm);
                }

                bouton_prochain_joueur.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim);
                        bouton_prochain_joueur.startAnimation(animation);

                        Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                        startActivity(otherActivity);
                        finish();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }

    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(Pioche.this);
        View qView = getLayoutInflater().inflate(R.layout.exit_message, null);

        Annuler = (TextView) qView.findViewById(R.id.annuler);
        Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.blink_anim_infinite);
        Annuler.startAnimation(animation);

        Question = (TextView) qView.findViewById(R.id.question);
        Question.setText(getResources().getString(R.string.question2));

        bouton_exit = (Button) qView.findViewById(R.id.bouton_exit);
        bouton_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        builder.setView(qView);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
