package com.example.thomd.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_play;
    Button bouton_exit;
    TextView Annuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button_play = (Button) findViewById(R.id.button_play);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                button_play.startAnimation(animation);

                Intent otherActivity = new Intent(getApplicationContext(), Joueur.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View qView = getLayoutInflater().inflate(R.layout.exit_message, null);

        Annuler = (TextView) qView.findViewById(R.id.annuler);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim_infinite);
        Annuler.startAnimation(animation);

        bouton_exit = (Button) qView.findViewById(R.id.bouton_exit);
        bouton_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        builder.setView(qView);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
