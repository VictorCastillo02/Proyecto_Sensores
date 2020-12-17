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

public class MainActivity extends AppCompatActivity {
    private CheckBox ck1,ck2, ck3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ck1 = (CheckBox) findViewById(R.id.ck1);
        ck2 = (CheckBox) findViewById(R.id.ck2);
        ck3 = (CheckBox) findViewById(R.id.ck3);
        btn = findViewById(R.id.btn);
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true && ck2.isChecked()==true){
                    ck2.toggle();
                }
                else if(b==true && ck3.isChecked()==true){
                    ck3.toggle();
                }
                else if(b==true && ck2.isChecked()==true && ck3.isChecked()==true){
                    ck2.toggle();
                    ck3.toggle();
                }
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true && ck1.isChecked()==true){
                    ck1.toggle();
                }
                else if(b==true && ck3.isChecked()==true){
                    ck3.toggle();
                }
                else if(b==true && ck1.isChecked()==true && ck3.isChecked()==true){
                    ck1.toggle();
                    ck3.toggle();
                }
            }
        });
        ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true && ck1.isChecked()==true){
                    ck1.toggle();
                }
                else if(b==true && ck2.isChecked()==true){
                    ck2.toggle();
                }
                else if(b==true && ck1.isChecked()==true && ck2.isChecked()==true){
                    ck1.toggle();
                    ck2.toggle();
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ck1.isChecked() == true) {
                    Intent prox = new Intent(MainActivity.this, Proximidad.class);
                    startActivityForResult(prox,0);
                }
                if (ck2.isChecked()==true){
                    Intent maps = new Intent(MainActivity.this, MapsActivity.class);
                    startActivityForResult(maps, 0);
                }
                if (ck3.isChecked()==true){
                    Intent acel = new Intent(MainActivity.this, MainAcelerometro.class);
                    startActivityForResult(acel,0);
                }
            }
        });
    }
}
