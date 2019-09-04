package com.arunsinghsaab98.testmyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnBThrowJab,btnBHook,btnKJ,btnKUC;
    Boxer boxerA = new Boxer();
    KickBoxer kBoxerA = new KickBoxer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBThrowJab = findViewById(R.id.btnThrowJab);
        btnBHook = findViewById(R.id.boxHook);
        btnKJ = findViewById(R.id.kj);
        btnKUC = findViewById(R.id.kuc);




        btnBThrowJab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+boxerA.throwJab(), Toast.LENGTH_SHORT).show();

            }
        });

        btnBHook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+boxerA.throwHook(), Toast.LENGTH_SHORT).show();
            }
        });

        btnKJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+kBoxerA.throwJab(), Toast.LENGTH_SHORT).show();
            }
        });


        Toast.makeText(getApplicationContext(),"Arun Singh Saab",Toast.LENGTH_LONG).show();


        btnKUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+kBoxerA.throwUpperCut(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
