package com.example.nicesio.apprevisao;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNomeLista = (Button)findViewById(R.id.main_btnOk);
        btnNomeLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView nomelista = (TextView) findViewById(R.id.main_txtNome);

                String nome_Lista = nomelista.getText().toString();

                Intent intent = new Intent(view.getContext(), ActivityLista.class);
                Bundle params = new Bundle();

                params.putString("nome", nome_Lista);

                intent.putExtras(params);
                startActivity(intent);


            }
        });

    }

}
