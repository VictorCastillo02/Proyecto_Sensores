package com.example.proyecto_vc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
   TextView tv;
    Button btn_inicio, btn_pre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btn_inicio = (Button) findViewById(R.id.btn_inicio);
        btn_pre = (Button) findViewById(R.id.btn_pre);
        tv = (TextView) findViewById(R.id.tv);

        btn_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pre = new Intent(MainActivity.this, Presentacion.class);
                startActivityForResult(pre,0);
            }
        });
        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selec = new Intent(MainActivity.this,Seleccion.class);
                startActivityForResult(selec, 0);
            }
        });
    }
}
