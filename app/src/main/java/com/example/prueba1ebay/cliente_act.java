package com.example.prueba1ebay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class cliente_act extends AppCompatActivity {

    private Spinner spin;
    private TextView text;
    private EditText edtex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_act);

        spin = (Spinner)findViewById(R.id.spn);
        text = (TextView)findViewById(R.id.tx);


        String[] lista = {"MARIO","FERNANDO", "CONSTANZA"};
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,lista);
        spin.setAdapter(adapter);


    }
    public void Calcular(View v){

        String producto = ((EditText) findViewById(R.id.etv)).getText().toString();
        String opcion = spin.getSelectedItem().toString();

        if (opcion.equals("MARIO")){

            if (producto.equals("HORNO")){
                int operacion = 500000 - 45000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }





            else if (producto.equals("ESPEJO")){
                int operacion = 500000 - 100000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }



            else if (producto.equals("SILLA")){
                int operacion = 500000 - 80000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }
            else{
                Toast.makeText(getApplicationContext(), "Ingrese Producto Correctamente",Toast.LENGTH_LONG).show();
            }
        }
        if (opcion.equals("FERNANDO")){
            if (producto.equals("HORNO")){
                int operacion = 120000 - 45000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }

            else if (producto.equals("ESPEJO")){
                int operacion = 120000 - 100000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }
            else if (producto.equals("SILLA")){
                int operacion = 120000 - 80000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }
            else{
                Toast.makeText(getApplicationContext(), "Ingrese Producto Correctamente", Toast.LENGTH_SHORT).show();
            }
        }
        if (opcion.equals("CONSTANZA")){
            if (producto.equals("HORNO")){
                int operacion = 320000 - 45000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }


            else if (producto.equals("ESPEJO")){
                int operacion = 320000 - 100000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }

            else if (producto.equals("SILLA")){
                int operacion = 320000 - 80000;
                String resultado = String.valueOf(operacion);
                text.setText("el saldo en su cuenta es: " + resultado);
            }
            else{
                Toast.makeText(getApplicationContext(), "Ingrese Producto Correctamente", Toast.LENGTH_SHORT).show();
            }
        }

    }

}