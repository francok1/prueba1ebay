package com.example.prueba1ebay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class producto_act extends AppCompatActivity {

    private EditText edt, edt2;
    private CheckBox cb,cb2,cb3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_act);


        edt2 = (EditText)findViewById(R.id.edt2);
        cb = (CheckBox) findViewById(R.id.cb);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        tv = (TextView)findViewById(R.id.tv);


    }
    public void calcular(View v){

        String producto = ((EditText) findViewById(R.id.edt)).getText().toString();

        if (cb.isChecked() == true){
            if (producto.equals("televisor")||(producto.equals("TELEVISOR"))) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 129000 - numero + 14500;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }

            }
            if (producto.equals("microondas")||(producto.equals("MICROONDAS"))) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 50000 - numero + 5500;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }
            }
            if (producto.equals("lavadora")||(producto.equals("LAVADORA"))) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 100000 - numero + 25000;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }

            }
        }
        if ((cb2.isChecked() == true) || (cb3.isChecked()==true)){
            if (producto.equals("TELEVISOR")||producto.equals("televisor")) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 129000 - numero ;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }
            }
            if (producto.equals("microondas")||(producto.equals("MICROONDAS"))) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 50000 - numero ;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }
            }
            if (producto.equals("lavadora")||(producto.equals("LAVADORA"))) {
                int numero = Integer.parseInt(edt2.getText().toString());
                int operacion = 100000 - numero ;
                String resultado = String.valueOf(operacion);
                tv.setText("su deuda es: " + resultado);

                if (operacion<0){
                    tv.setText("su pago sobrepasa el precio, porfavor ingrese el monto estimado");
                }
                if (operacion==0){
                    tv.setText("gracias por comprar con nosotros");
                }
            }
        }

    }

}