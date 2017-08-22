package com.i053114.clase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);
    }

    public void goActivity1(View view){
        Intent mypantalla1 = new Intent(this, MainActivity.class);
        startActivity(mypantalla1);

    }
}
