package com.example.avaliacao2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCell extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] carro;
    private final Integer[] imgId;

    public ListCell(Activity context, String[] carro, Integer[] imgId){
        super(context, R.layout.list_cell, carro);
        this.context = context;
        this.carro = carro;
        this.imgId = imgId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_cell, null, true);
        TextView txtTitle = (TextView)rowView.findViewById(R.id.carroNome);
        ImageView imgView = (ImageView)rowView.findViewById(R.id.carroImg);
        txtTitle.setText(carro[position]);
        imgView.setImageResource(imgId[position]);

        return rowView;
    }
}
