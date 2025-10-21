package com.example.przekazywaniedanychzadanie4;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //zadanie 4
    public static final String EXTRA_NAME = "com.example.form.NAME";
    public static final String EXTRA_YEAR = "com.example.form.YEAR";
    private Button btn_form;
    private EditText name,year;


    //zadanie5

    public static final String EXTRA_STATE = "com.example.switch.STATE";
    private Switch aSwitch;
    private Button zapisz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //zadanie 4
        btn_form = findViewById(R.id.btn_form);

        name = findViewById(R.id.name);
        year = findViewById(R.id.year);

        btn_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,MainActivity2.class);

                intent4.putExtra(EXTRA_NAME,name.getText().toString().trim());
                intent4.putExtra(EXTRA_YEAR,year.getText().toString().trim());

                startActivity(intent4);
            }
        });

        //zadanie 5
        zapisz = findViewById(R.id.zapisz);
        aSwitch = findViewById(R.id.switch1);

        zapisz.setOnClickListener(v->{
            boolean state = aSwitch.isChecked();

            Intent intent5 = new Intent(MainActivity.this, MainActivity2.class);
            intent5.putExtra(EXTRA_STATE, state);

            // Uruchom drugą aktywność
            startActivity(intent5);
        });

    }
}