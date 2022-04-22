package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_options extends AppCompatActivity {

    private Button button_done;
    private Button button_suggest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_options);
        getSupportActionBar().hide();

        button_done = findViewById(R.id.buttondone);
        button_suggest = findViewById(R.id.buttonsuggest);

        button_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(select_options.this,calorie_burnt.class);
                startActivity(intent);
            }
        });

        button_suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select_options.this,suggest_exercise.class);
                startActivity(intent);
            }
        });
    }
}