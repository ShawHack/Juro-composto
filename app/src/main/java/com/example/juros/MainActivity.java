package com.example.juros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText campoCapitalInvestido,campoJuros,campoPeriodo;

    double capitalInvestido,juros;
    int periodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         campoCapitalInvestido = findViewById(R.id.editTextCapitalInsvestido);
         campoJuros = findViewById(R.id.editTexttaxaJuros);
         campoPeriodo = findViewById(R.id.editTextPeriodo);



    }

    public void calcularJurosComposto(View view){

        capitalInvestido = Double.parseDouble(campoCapitalInvestido.getText().toString());
        juros = Double.parseDouble(campoJuros.getText().toString());
        periodo =Integer.parseInt(campoPeriodo.getText().toString());

        int flag =1;
        Intent intent = new Intent(MainActivity.this,CalculoActivity.class);
           intent.putExtra("capitalInvestido",capitalInvestido);
           intent.putExtra("juros",juros);
           intent.putExtra("periodo",periodo);
           intent.putExtra("flag",flag);
        startActivity(intent);

    }
    public void calcularJurosSimples(View view){

        capitalInvestido = Double.parseDouble(campoCapitalInvestido.getText().toString());
        juros = Double.parseDouble(campoJuros.getText().toString());
        periodo = Integer.parseInt(campoPeriodo.getText().toString());


        int flag =2;
        Intent intent = new Intent(MainActivity.this,CalculoActivity.class);
        intent.putExtra("capitalInvestido",capitalInvestido);
        intent.putExtra("juros",juros);
        intent.putExtra("periodo",periodo);
        intent.putExtra("flag",flag);
        startActivity(intent);

    }




}
