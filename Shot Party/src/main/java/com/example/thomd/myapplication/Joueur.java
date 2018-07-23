package com.example.thomd.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Joueur extends AppCompatActivity {

    private Button button_suivant;
    Button bouton_exit;
    TextView Annuler, Question;

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
        final AlertDialog.Builder builder = new AlertDialog.Builder(Joueur.this);
        View qView = getLayoutInflater().inflate(R.layout.exit_message, null);

        Annuler = (TextView) qView.findViewById(R.id.annuler);
        Animation animation = AnimationUtils.loadAnimation(Joueur.this, R.anim.blink_anim_infinite);
        Annuler.startAnimation(animation);

        Question = (TextView) qView.findViewById(R.id.question);
        Question.setText(getResources().getString(R.string.question));

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
