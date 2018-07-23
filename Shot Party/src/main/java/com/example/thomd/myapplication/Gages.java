package com.example.thomd.myapplication;

import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class Gages {
    public String getGages(){
        Random NbreRdm = new Random();
        String Gage = "";

        switch (NbreRdm.nextInt(19)){
            case 0 :
                Gage = getResources().getString(R.string.g5);
        }
        return  Gage;
    }
}
