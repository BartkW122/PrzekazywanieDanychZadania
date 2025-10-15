package com.example.przekazywaniedanychzadanie1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Zadanie 1
    public static final String EXTRA_INFO = "com.example.przekazywaniedanych.INFO";

    private Button btn;

    //Zadanie 2
    public static final String EXTRA_NUMBER1 = "com.example.dodawanie.LICZBA1";
    public static final String EXTRA_NUMBER2 = "com.example.dodawanie.LICZBA2";
    private Button btn_kalkulator;
    private EditText liczba1,liczba2;

    //Zadanie 3
    public static final String EXTRA_NAME = "com.example.form.NAME";
    public static final String EXTRA_YEAR = "com.example.form.YEAR";
    private Button btn_form;
    private EditText name,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Zadanie 1

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);

                intent1.putExtra(EXTRA_INFO,"Dane zostały pomyślnie przekazane!");

                startActivity(intent1);
            }
        });

        //Zadanie 2

        btn_kalkulator = findViewById(R.id.btn_kalkulator);

        liczba1 = findViewById(R.id.Liczba1);
        liczba2 = findViewById(R.id.Liczba2);

        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);

                String liczba1_value = liczba1.getText().toString().trim();
                String liczba2_value = liczba2.getText().toString().trim();

                intent2.putExtra(EXTRA_NUMBER1,liczba1.getText().toString().trim());
                intent2.putExtra(EXTRA_NUMBER2,liczba2.getText().toString().trim());

                startActivity(intent2);
            }
        });

        //Zadanie 4

        /*btn_form = findViewById(R.id.btn_form);

        name = findViewById(R.id.name);
        year = findViewById(R.id.year);

        btn_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent3);

                intent3.putExtra(EXTRA_NAME,name.getText().toString().trim());
                intent3.putExtra(EXTRA_YEAR,year.getText().toString().trim());

                startActivity(intent3);
            }
        });*/
    }
}