package com.i053114.clase4;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //evento para el float-1era linease declara el boton
        FloatingActionButton fab =(FloatingActionButton) findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityDOS(view);
            }
        });

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        registerForContextMenu(btn_1);



    }

    //al hacer click al boton desplazar hacia la pantalla 2
    //view= permite recibir toda la propiedad del boton
    public void goActivityDOS(View view){
        //inten = contiene todas la atividades(activity) de la aplicacion el cual recibe dos parametros
        //intent  recive dos parametros
        //1er el contexto desde donde se esta llamando el objeto
        //2do parametro el lugar de  donde se quiere  ir

        Intent mypantalla = new Intent(this, MainDosActivity.class);
        startActivity(mypantalla);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater =getMenuInflater();
        menu.setHeaderTitle("Mis Opciones");
        inflater.inflate(R.menu.menu_uno, menu );
    }
}
