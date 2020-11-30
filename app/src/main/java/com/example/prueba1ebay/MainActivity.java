package com.example.prueba1ebay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView in,ic;
    private Button btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in = (EditText)findViewById(R.id.in);
        ic = (EditText)findViewById(R.id.ic);
        btt = (Button)findViewById(R.id.Button);

        btt.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.in)).getText().toString();
                String contraseña = ((EditText) findViewById(R.id.ic)).getText().toString();

                if (usuario.equals("android") && contraseña.equals("123")){
                    Intent i = new Intent(MainActivity.this, menu_act.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    /*public void menu(View V){
            String usuario = ((EditText) findViewById(R.id.in)).getText().toString();
            String contraseña = ((EditText) findViewById(R.id.ic)).getText().toString();


           if (usuario.equals("android") && contraseña.equals("123"))
            {
                Intent i = new Intent(MainActivity.this, menu_act.class);
                startActivity(i);
            }
            else {
               Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
           }
   }*/

}