package com.example.avaliacao2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalhe extends AppCompatActivity {

    ImageView imgView;
    TextView ano;
    TextView marca;
    TextView modelo;
    TextView valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Intent it = getIntent();
        Bundle params = it.getExtras();
        String carro = params.getString("veiculo");

        imgView = (ImageView)findViewById(R.id.imageView);
        ano = (TextView)findViewById(R.id.anoInput);
        modelo = (TextView)findViewById(R.id.modeloInput);
        marca = (TextView)findViewById(R.id.marcaInput);
        valor = (TextView)findViewById(R.id.valorInput);

        switch(carro) {
            case "Fusion - R$ 70.000":
                imgView.setImageResource(R.drawable.iconfusion);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Fusion");
                marca.setText("Marca: Ford");
                valor.setText("Valor: R$ 70.000");
                break;
            case "Ka - R$ 20.000":
                imgView.setImageResource(R.drawable.iconka);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Ka");
                marca.setText("Marca: Ford");
                valor.setText("Valor: R$ 20.000");
                break;
            case "Fiesta - R$ 30.000":
                imgView.setImageResource(R.drawable.iconfiesta);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Fiesta");
                marca.setText("Marca: Ford");
                valor.setText("Valor: R$ 30.000");
                break;
            case "Cruze - R$ 40.000":
                imgView.setImageResource(R.drawable.iconcruze);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Cruze");
                marca.setText("Marca: Chevrolet");
                valor.setText("Valor: R$ 40.000");
                break;
            case "Corsa - R$ 12.000":
                imgView.setImageResource(R.drawable.iconcorsa);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Corsa");
                marca.setText("Marca: Chevrolet");
                valor.setText("Valor: R$ 12.000");
                break;
            case "Onix - R$ 25.000":
                imgView.setImageResource(R.drawable.icononix);
                ano.setText("Ano: 2015");
                modelo.setText("Modelo: Onix");
                marca.setText("Marca: Chevrolet");
                valor.setText("Valor: R$ 25.000");
                break;
            }

        }

    }
