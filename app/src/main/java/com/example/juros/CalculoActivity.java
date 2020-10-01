package com.example.juros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculoActivity extends AppCompatActivity {

    TextView campoCpResultado,campoJurosResultado,campoPeriodoResultado,campoMontanteResultado,campoFonte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        campoCpResultado =findViewById(R.id.textViewCapitalInvestidoReultado);
        campoJurosResultado = findViewById(R.id.textViewJutosResultado);
        campoPeriodoResultado = findViewById(R.id.textView5PeriodoResultado);
        campoMontanteResultado = findViewById(R.id.textViewMontanteFinaResultado);
        campoFonte = findViewById(R.id.textViewFonte);

         double cpInvestido = getIntent().getDoubleExtra("capitalInvestido",0);
         double juros = getIntent().getDoubleExtra("juros",0);
        int periodo = getIntent().getIntExtra("periodo",0);
         int flag = getIntent().getIntExtra("flag",0);


         double montante=0;

         if(flag==1){


               montante = cpInvestido * Math.pow ((1+juros/100),periodo);

                 campoPeriodoResultado.setText("Periodo: "+24+" meses");
                 campoMontanteResultado.setText("Montante acumulado R$: "+montante);
             campoCpResultado.setText("Capital investido: "+cpInvestido);
             campoJurosResultado.setText("Taxa de juros: "+juros+"% ao mês");


         }else {

             montante = cpInvestido + (cpInvestido *(periodo*juros)/100);

             campoPeriodoResultado.setText("Periodo: "+periodo+" meses");



             campoMontanteResultado.setText(" Montante acumulado R$: "+montante);
             campoCpResultado.setText("Capital investido: "+cpInvestido);
             campoJurosResultado.setText("Taxa de juros: "+juros+"% ao mês");


         }



    }
}
