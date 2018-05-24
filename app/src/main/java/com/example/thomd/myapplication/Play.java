package com.example.thomd.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Play extends AppCompatActivity {

    private Button Button_turn, Button_suite;
    private ImageView roue;
    private TextView textCouleur;
    private String colorCase;

    Random r;

    int degree = 0, degree_old = 0;

    private static final  float FACTOR = 5.625f;

    public Play() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Button_turn = findViewById(R.id.Button_turn);
        this.Button_suite = findViewById(R.id.Button_suite);
        Button_suite.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                final String couleur = textCouleur.getText().toString();

                Intent otherActivity = new Intent(getApplicationContext(), Pioche.class);


                //Passage du paramètre avec l'id 'color'

                otherActivity.putExtra("color",colorCase);

               otherActivity.putExtra("color",colorCase);


                startActivity(otherActivity);

                finish();

            }
        });
        roue = findViewById(R.id.roue);
        textCouleur = findViewById(R.id.textCouleur);

        r = new Random();

        Button_suite.setVisibility(View.INVISIBLE);

        Button_turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree_old = degree % 360;
                degree = r.nextInt(3600) + 720;

                RotateAnimation rotate = new RotateAnimation(degree_old, degree,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                        textCouleur.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        colorCase = currentNumber(360 - (degree % 360));

                        textCouleur.setText(colorCase);
                        Button_turn.setVisibility(View.INVISIBLE);
                        Button_suite.setVisibility(View.VISIBLE);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                roue.startAnimation(rotate);

            }
        });
    }
    private String currentNumber(int degrees){
        String text = "";

        if(degrees >= (FACTOR * 0) && degrees < (FACTOR * 2)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 2) && degrees < (FACTOR * 4)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 4) && degrees < (FACTOR * 6)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 6) && degrees < (FACTOR * 8)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 8) && degrees < (FACTOR * 10)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 10) && degrees < (FACTOR * 12)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 12) && degrees < (FACTOR * 14)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 14) && degrees < (FACTOR * 16)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 16) && degrees < (FACTOR * 18)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 18) && degrees < (FACTOR * 20)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees>= (FACTOR * 20) && degrees < (FACTOR * 22)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 22) && degrees < (FACTOR * 24)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 24) && degrees < (FACTOR * 26)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 26) && degrees < (FACTOR * 28)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 28) && degrees < (FACTOR * 30)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 30) && degrees < (FACTOR * 32)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 32) && degrees < (FACTOR * 34)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 34) && degrees < (FACTOR * 36)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 36) && degrees < (FACTOR * 38)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 38) && degrees < (FACTOR * 40)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 40) && degrees < (FACTOR * 42)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 42) && degrees < (FACTOR * 44)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 44) && degrees < (FACTOR * 46)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 46) && degrees < (FACTOR * 48)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 48) && degrees < (FACTOR * 50)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 50) && degrees < (FACTOR * 52)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 52) && degrees < (FACTOR * 54)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 54) && degrees < (FACTOR * 56)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }
        if(degrees >= (FACTOR * 56) && degrees < (FACTOR * 58)){
            text = "V E R T";
            textCouleur.setTextColor(getResources().getColor(R.color.green));
        }
        if(degrees >= (FACTOR * 58) && degrees < (FACTOR * 60)){
            text = "O R A N G E";
            textCouleur.setTextColor(getResources().getColor(R.color.orange));
        }
        if(degrees >= (FACTOR * 60) && degrees < (FACTOR * 62)){
            text = "R O U G E";
            textCouleur.setTextColor(getResources().getColor(R.color.red));
        }
        if(degrees >= (FACTOR * 62) && degrees < (FACTOR * 64)){
            text = "N O I R";
            textCouleur.setTextColor(getResources().getColor(R.color.black));
        }

        if((degrees >= (FACTOR * 64) && degrees < 360) || (degrees >= 0 && degrees < (FACTOR * 0))){
            text = "";
        }




        return text;
    }

}
