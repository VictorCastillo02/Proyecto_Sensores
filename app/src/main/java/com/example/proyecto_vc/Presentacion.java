package com.example.proyecto_vc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Presentacion extends AppCompatActivity {
    TextView tv1,tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13;
    Button btn_r;
    ImageView img1, img2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pre);
            btn_r = (Button) findViewById(R.id.btn_r);
            tv1 = (TextView) findViewById(R.id.tv1);
            tv2 = (TextView) findViewById(R.id.tv2);
            tv3 = (TextView) findViewById(R.id.tv3);
            tv4 = (TextView) findViewById(R.id.tv4);
            tv5 = (TextView) findViewById(R.id.tv5);
            tv6 = (TextView) findViewById(R.id.tv6);
            tv7 = (TextView) findViewById(R.id.tv7);
            tv8 = (TextView) findViewById(R.id.tv8);
            tv9 = (TextView) findViewById(R.id.tv9);
            tv10 = (TextView) findViewById(R.id.tv10);
            tv11 = (TextView) findViewById(R.id.tv11);
            tv12 = (TextView) findViewById(R.id.tv12);
            tv13 = (TextView) findViewById(R.id.tv13);
            img1 = (ImageView) findViewById(R.id.img1);
            img2 = (ImageView) findViewById(R.id.img2);
            btn_r.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ini = new Intent(Presentacion.this, MainActivity.class);
                    startActivityForResult(ini,0);
                }
            });

        }
    }
