package com.example.thomd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
                Intent otherActivity = new Intent(getApplicationContext(), Play.class);
                startActivity(otherActivity);
            }
        });

    }
}
