package com.app.biblioteca;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import chile.maps.biblioteca.R;

public class Sec_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_act);
    }

    public void Incidencia1(View v)
    {
        Toast toast1 = Toast.makeText((getApplicationContext()),"Incidencia ocurrida", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,0);
    }
    public void Incidencia2(View v)
    {
        Toast toast2 = Toast.makeText((getApplicationContext()),"Incidencia ocurrida 2", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER,0,0);
    }
}