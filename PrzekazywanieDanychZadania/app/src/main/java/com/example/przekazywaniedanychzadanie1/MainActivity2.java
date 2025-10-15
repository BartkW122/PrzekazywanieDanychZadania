package com.example.przekazywaniedanychzadanie1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView info_text,wynikDodawania,name_info,year_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        //Zadanie 1
        info_text = findViewById(R.id.info);

        Intent intent1 = getIntent();

        if(intent1 != null && intent1.hasExtra(MainActivity.EXTRA_INFO)){
            String info = intent1.getStringExtra(MainActivity.EXTRA_INFO);

            info_text.setText(info);
        }else{
            info_text.setText("Dane nie zostały pomyślnie przekazane!");
        }

        //Zadanie 2
        wynikDodawania = findViewById(R.id.wynikDodawania);

        Intent intent2=getIntent();

        if(intent2 != null){

            String liczba1=intent2.getStringExtra(MainActivity.EXTRA_NUMBER1);
            String liczba2=intent2.getStringExtra(MainActivity.EXTRA_NUMBER2);

            Integer wynik = Integer.valueOf(liczba1)+Integer.valueOf(liczba2);
            wynikDodawania.setText("Wynik dodawania: "+ wynik.toString());
        }else{
            wynikDodawania.setText("Wynik dodawania: "+0);
        }

        //Zadanie 4
        /*name_info = findViewById(R.id.name_info);
        year_info = findViewById(R.id.year_info);

        Intent intent3 = getIntent();

        if(intent3 != null){
            name_info.setText("imie: "+intent3.getStringExtra(MainActivity.EXTRA_NAME));
            year_info.setText("year: "+intent3.getStringExtra(MainActivity.EXTRA_YEAR));
        }*/
    }
}