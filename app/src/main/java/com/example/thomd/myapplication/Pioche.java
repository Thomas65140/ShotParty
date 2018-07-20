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
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    Button bouton_prochain_joueur;
    TextView messageRdm;

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
        b10 = (Button)findViewById(R.id.button10);
        b11 = (Button)findViewById(R.id.button11);
        b12 = (Button)findViewById(R.id.button12);

        messageRdm = (TextView)findViewById(R.id.message_random);

        //Log.d("CODE", "Information");

        //récupération du paramètre
        String colorCase = getIntent().getStringExtra("color");
        Toast.makeText(getApplicationContext(),"C O U L E U R    " + colorCase, Toast.LENGTH_LONG).show();

        //Log.d("CODE", "colorCase");

        //Nombre aleatoire
        hNombre = new Random();

        if(colorCase.equals("V E R T"))
        {
            cpioche.setBackground(getResources().getDrawable(R.drawable.fond_mystere_vert));

            try {
                switch (hNombre.nextInt(100)) {
                    // Bois un verre ----------------------------------------------------------------------

                    case 0:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 1:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 2:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 3:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 4:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 5:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 6:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 7:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 8:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 9:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 10:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 11:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 12:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 13:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 14:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 15:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 16:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 17:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 18:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 19:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 20:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 21:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 22:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 23:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 24:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 25:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 26:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 27:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 28:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 29:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 30:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 31:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 32:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 33:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 34:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 35:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 36:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 37:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 38:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 39:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 40:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 41:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 42:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 43:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 44:
                        messageRdm.setText(getResources().getString(R.string.b5));
                        break;

                    case 45:
                        messageRdm.setText(getResources().getString(R.string.b6));
                        break;

                    case 46:
                        messageRdm.setText(getResources().getString(R.string.b7));
                        break;

                    case 47:
                        messageRdm.setText(getResources().getString(R.string.b8));
                        break;

                    case 48:
                        messageRdm.setText(getResources().getString(R.string.b9));
                        break;

                    case 49:
                        messageRdm.setText(getResources().getString(R.string.d1));
                        break;

                    case 50:
                        messageRdm.setText(getResources().getString(R.string.d2));
                        break;

                    case 51:
                        messageRdm.setText(getResources().getString(R.string.d3));
                        break;

                    case 52:
                        messageRdm.setText(getResources().getString(R.string.d4));
                        break;

                    case 53:
                        messageRdm.setText(getResources().getString(R.string.d5));
                        break;

                    case 54:
                        messageRdm.setText(getResources().getString(R.string.d6));
                        break;

                    case 55:
                        messageRdm.setText(getResources().getString(R.string.d7));
                        break;

                    case 56:
                        messageRdm.setText(getResources().getString(R.string.c1));
                        break;

                    case 57:
                        messageRdm.setText(getResources().getString(R.string.c2));
                        break;

                    case 58:
                        messageRdm.setText(getResources().getString(R.string.c3));
                        break;

                    case 59:
                        messageRdm.setText(getResources().getString(R.string.c4));
                        break;

                    case 60:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 61:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 62:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 63:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 64:
                        messageRdm.setText(getResources().getString(R.string.b5));
                        break;

                    case 65:
                        messageRdm.setText(getResources().getString(R.string.b6));
                        break;

                    case 66:
                        messageRdm.setText(getResources().getString(R.string.b7));
                        break;

                    case 67:
                        messageRdm.setText(getResources().getString(R.string.b8));
                        break;

                    case 68:
                        messageRdm.setText(getResources().getString(R.string.b9));
                        break;

                    case 69:
                        messageRdm.setText(getResources().getString(R.string.d1));
                        break;

                    case 70:
                        messageRdm.setText(getResources().getString(R.string.d2));
                        break;

                    case 71:
                        messageRdm.setText(getResources().getString(R.string.d3));
                        break;

                    case 72:
                        messageRdm.setText(getResources().getString(R.string.d4));
                        break;

                    case 73:
                        messageRdm.setText(getResources().getString(R.string.d5));
                        break;

                    case 74:
                        messageRdm.setText(getResources().getString(R.string.d6));
                        break;

                    case 75:
                        messageRdm.setText(getResources().getString(R.string.d7));
                        break;

                    case 76:
                        messageRdm.setText(getResources().getString(R.string.c1));
                        break;

                    case 77:
                        messageRdm.setText(getResources().getString(R.string.c2));
                        break;

                    case 78:
                        messageRdm.setText(getResources().getString(R.string.c3));
                        break;

                    case 79:
                        messageRdm.setText(getResources().getString(R.string.c4));
                        break;

                    case 80:
                        messageRdm.setText(getResources().getString(R.string.b1));
                        break;

                    case 81:
                        messageRdm.setText(getResources().getString(R.string.b2));
                        break;

                    case 82:
                        messageRdm.setText(getResources().getString(R.string.b3));
                        break;

                    case 83:
                        messageRdm.setText(getResources().getString(R.string.b4));
                        break;

                    case 84:
                        messageRdm.setText(getResources().getString(R.string.b5));
                        break;

                    case 85:
                        messageRdm.setText(getResources().getString(R.string.b6));
                        break;

                    case 86:
                        messageRdm.setText(getResources().getString(R.string.b7));
                        break;

                    case 87:
                        messageRdm.setText(getResources().getString(R.string.b8));
                        break;

                    case 88:
                        messageRdm.setText(getResources().getString(R.string.b9));
                        break;

                    case 89:
                        messageRdm.setText(getResources().getString(R.string.d1));
                        break;

                    case 90:
                        messageRdm.setText(getResources().getString(R.string.d2));
                        break;

                    case 91:
                        messageRdm.setText(getResources().getString(R.string.d3));
                        break;

                    case 92:
                        messageRdm.setText(getResources().getString(R.string.d4));
                        break;

                    case 93:
                        messageRdm.setText(getResources().getString(R.string.d5));
                        break;

                    case 94:
                        messageRdm.setText(getResources().getString(R.string.d6));
                        break;

                    case 95:
                        messageRdm.setText(getResources().getString(R.string.d7));
                        break;

                    case 96:
                        messageRdm.setText(getResources().getString(R.string.c1));
                        break;

                    case 97:
                        messageRdm.setText(getResources().getString(R.string.c2));
                        break;

                    case 98:
                        messageRdm.setText(getResources().getString(R.string.c3));
                        break;

                    case 99:
                        messageRdm.setText(getResources().getString(R.string.c4));
                        break;

                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
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

                if(colorCase.equals("V E R T"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_vert));
                }
                if(colorCase.equals("O R A N G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_orange));
                }
                if(colorCase.equals("R O U G E"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_rouge));
                }
                if(colorCase.equals("N O I R"))
                {
                    bouton_prochain_joueur.setBackground(getResources().getDrawable(R.drawable.custom_bouton_nextplayer_noir));
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
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b3.startAnimation(animation);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b4.startAnimation(animation);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b5.startAnimation(animation);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b6.startAnimation(animation);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b7.startAnimation(animation);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b8.startAnimation(animation);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b9.startAnimation(animation);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b10.startAnimation(animation);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b11.startAnimation(animation);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Pioche.this, R.anim.bounce);
                b12.startAnimation(animation);
            }
        });
    }
}
