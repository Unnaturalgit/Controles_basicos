package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import java.math.*;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2;
    private TextView txtresultado;
    private RadioButton rbdsuma, rbdresta, rbdmultiplicacion, rbdivision, rbdelevado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.txtnum2);
        edt2 = (EditText) findViewById(R.id.txtnum1);
        rbdsuma = (RadioButton) findViewById(R.id.rbtsuma);
        rbdresta = (RadioButton) findViewById(R.id.rbtresta);
        rbdmultiplicacion = (RadioButton) findViewById(R.id.rbtmultiplicacion);
        rbdivision = (RadioButton) findViewById(R.id.rbtdivision);
        rbdelevado = (RadioButton) findViewById(R.id.rbtelevado);
        txtresultado = (TextView) findViewById(R.id.txtres);


    }

    public void Sumar(View view) {
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor1);
        int suma = nro1 + nro2;
        String resu = String.valueOf(suma);
        txtresultado.setText(resu);
    }

    public void Operar(View view) {
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        if (rbdsuma.isChecked()) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            txtresultado.setText(resu);
        } else {
            if (rbdresta.isChecked()) {
                int resta = nro1 - nro2;
                String resu = String.valueOf(resta);
                txtresultado.setText(resu);
            } else {
                if (rbdmultiplicacion.isChecked()) {
                    int mult = nro1 * nro2;
                    String resu = String.valueOf(mult);
                    txtresultado.setText(resu);
                } else {
                    if (rbdivision.isChecked()) {
                        int div = nro1 / nro2;
                        String resu = String.valueOf(div);
                        txtresultado.setText(resu);
                    } else {
                        if (rbdelevado.isChecked()) {
                            double num1 = Double.parseDouble(String.valueOf(nro1));
                            double num2 = Double.parseDouble(String.valueOf(nro2));
                            double mult = Math.pow(num2, num1);
                            String resu = String.valueOf(mult);
                            txtresultado.setText(resu);
                        }

                    }

                }
            }
        }
    }
}