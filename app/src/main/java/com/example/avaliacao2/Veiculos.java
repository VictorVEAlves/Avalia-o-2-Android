package com.example.avaliacao2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Veiculos extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculos);

        String[] veiculos = new String[3];
        Integer[] img = new Integer[3];

        Intent it = getIntent();
        Bundle params = it.getExtras();
        String marca = params.getString("marca");

        if(marca.equals("Chevrolet")){
            veiculos = new String[]{"Cruze - R$ 40.000", "Corsa - R$ 12.000", "Onix - R$ 25.000"};
            img = new Integer[]{R.drawable.iconcruze, R.drawable.iconcorsa, R.drawable.icononix};
        }else if(marca.equals("Ford")){
            veiculos = new String[]{"Fusion - R$ 70.000", "Ka - R$ 20.000", "Fiesta - R$ 30.000"};
            img = new Integer[]{R.drawable.iconfusion, R.drawable.iconka, R.drawable.iconfiesta};
        }

        ListCell adapter = new ListCell(Veiculos.this, veiculos, img);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        final String[] finalVeiculos = veiculos;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Veiculos.this, Detalhe.class);
                Bundle params = new Bundle();
                params.putString("veiculo", finalVeiculos[+position]);
                it.putExtras(params);
                startActivity(it);
            }
        });

    }
}
