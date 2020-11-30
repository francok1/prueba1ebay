package com.example.prueba1ebay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);



    }
    public void coment(View v){

        Intent i = new Intent(this, comentario_act.class);
        startActivity(i);

    }
    public void producto(View v){

        Intent i = new Intent(this, producto_act.class);
        startActivity(i);

    }
    public void info(View v){

        Intent i = new Intent(this, info_act.class);
        startActivity(i);

    }
    public void cliente(View v){

        Intent i = new Intent(this, cliente_act.class);
        startActivity(i);

    }

}