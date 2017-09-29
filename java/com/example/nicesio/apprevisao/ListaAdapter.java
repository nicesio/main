package com.example.nicesio.apprevisao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nicesio on 19/09/2017.
 */

public class ListaAdapter extends ArrayAdapter<ListadeCompras> {

    Context contexto;
    ArrayList<ListadeCompras> lst;

    public ListaAdapter(Context context, int resource, ArrayList<ListadeCompras> objects){
        super (context, resource, objects );
        this.contexto=context;
        this.lst=objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listaView = LayoutInflater.from(contexto).inflate(R.layout.liista, parent, false);

        TextView Produto = (TextView) listaView.findViewById(R.id.liista_Nome);
        TextView Quantidade = (TextView) listaView.findViewById(R.id.liista_quantidade);
        TextView Categoria = (TextView) listaView.findViewById(R.id.liista_Categoria);

        Produto.setText(lst.get(position).getProduto());
        Quantidade.setText(lst.get(position).getQuantidade());
        Categoria.setText(lst.get(position).getCategoria());


        return listaView;

    }


}
