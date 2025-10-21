package com.example.przekazywaniedanychzadanie4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView name_info,year_info,switch_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        name_info = findViewById(R.id.name_info);
        year_info = findViewById(R.id.year_info);

        Intent intent4 = getIntent();

        if(intent4 != null){
            name_info.setText("imie: "+intent4.getStringExtra(MainActivity.EXTRA_NAME));
            year_info.setText("year: "+intent4.getStringExtra(MainActivity.EXTRA_YEAR));
        }

        switch_info = findViewById(R.id.switch_info);

        Intent intent5 = getIntent();

        boolean state = getIntent().getBooleanExtra(MainActivity.EXTRA_STATE,false);

        if(state){
            switch_info.setText("Ustawienia premium: Włączone");
        }else{
            switch_info.setText("Ustawienia premium: Wyłączone");
        }
    }
}