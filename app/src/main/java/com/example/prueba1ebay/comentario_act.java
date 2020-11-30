package com.example.prueba1ebay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class comentario_act extends AppCompatActivity {

    private Spinner spinner;
    private RatingBar rating;
    private ProgressBar progress;
    private int progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario_act);

        spinner = (Spinner)findViewById(R.id.spr);
        rating = (RatingBar)findViewById(R.id.rt);
        progress = (ProgressBar)findViewById(R.id.pb);

        String[] lista = {"TELEVISOR","REFRIGERADOR","HORNO", "LAVADORA"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spinner.setAdapter(adapter);


    }
    public void Calificar(View v){

        rating.setRating(3);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                progreso++;
                progress.setProgress(progreso);

            }
        };
        long periods = 100;
        long delay = 0;

        t.schedule(tt,delay,periods);


    }



}