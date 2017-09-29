package com.example.nicesio.apprevisao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        final ListView lstProdutos = (ListView)findViewById(R.id.main_lstComprado);
        final ArrayList<ListadeCompras> listadecompras = new ArrayList<ListadeCompras>();
        final ListView listaVi = (ListView) findViewById(R.id.main_lstComprado);
        final ArrayAdapter adapter = new ListaAdapter(this, R.layout.activity_lista, listadecompras);
        listaVi.setAdapter(adapter);
        final Button btnSalvar = (Button)findViewById(R.id.lista_btnSalvar);

        final TextView txtQuantidade = (TextView)findViewById(R.id.lista_txtQuantidade);

        TextView nomelista = (TextView)findViewById(R.id.lista_nomeLista);
        Bundle args = getIntent().getExtras();
        String nomeParam = args.getString("nome");
        nomelista.setText(nomeParam);



        final TextView txtProduto = (TextView)findViewById(R.id.lista_txtProduto);


        String[] categorias = {"Alimentação", "Frios", "Vegetais", "Limpeza", "Higiene"};
        final Spinner spnCategorias = (Spinner)findViewById(R.id.lista_spinnercategoria);
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categorias);
        adpter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spnCategorias.setAdapter(adpter);

        final CheckBox Perecivel = (CheckBox)findViewById(R.id.lista_chkPerecivel);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (Perecivel.isChecked()==true){
                    alert("Alimento Perecivel");
                }
                else {
                    alert("Alimento Não Perecivel");
                }


                String Produto = txtProduto.getText().toString();
                //int qtdade = Integer.parseInt(txtQuantidade.getText().toString());
                String qtdade = txtQuantidade.getText().toString();
                String Categoria = spnCategorias.getSelectedItem().toString();


                ListadeCompras L = new ListadeCompras(Produto,qtdade,Categoria);

                listadecompras.add(L);

                adapter.notifyDataSetChanged();


            }
        });
    }
    private void alert(String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}


