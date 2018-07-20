package com.example.thomd.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Joueur extends AppCompatActivity {

    private Button button_suivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joueur);

        this.button_suivant = (Button) findViewById(R.id.button_suivant);
        button_suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Joueur.this, R.anim.blink_anim);
                button_suivant.startAnimation(animation);

                Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                startActivity(otherActivity);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed(){
        Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(otherActivity);
        finish();
    }
}
