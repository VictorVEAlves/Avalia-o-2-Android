package com.example.avaliacao2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] marcas = {"Chevrolet", "Ford"};
        ArrayAdapter<String> array = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marcas);
        setListAdapter(array);

    }

    @Override
    protected void onListItemClick(ListView lv, View v, int position, long id){
        super.onListItemClick(lv, v, position, id);
        Object obj = this.getListAdapter().getItem(position);
        String item = obj.toString();

        Intent it = new Intent(this, Veiculos.class);

        Bundle params = new Bundle();
        params.putString("marca", item);
        it.putExtras(params);
        startActivity(it);

    }

}