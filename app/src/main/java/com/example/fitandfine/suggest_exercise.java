package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class suggest_exercise extends AppCompatActivity {

    TextView textView4;
    EditText editTextNumber2;
    Button submit_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest_exercise);
        getSupportActionBar().hide();

        submit_button2 = (Button) findViewById(R.id.submit_button2);
        textView4 = (TextView) findViewById(R.id.textView4);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);

        submit_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num;
                if (editTextNumber2.getText().toString().trim().equals("")) {
                    editTextNumber2.setError("This field is required!");
                } else {

                    num = Integer.parseInt(editTextNumber2.getText().toString());
                    if (num >= 0 && num < 100) {
                        showToast("Walking for 30 mins.");
                    } else if (num >= 100 && num < 200) {
                        showToast("Jogging for 20 mins");
                    } else if (num >= 200 && num < 300) {
                        showToast("Swimming for 15 mins");
                    } else if (num >= 300 && num < 400) {
                        showToast("Stair climbing(3sets of 10 reps)");
                    } else {
                        showToast("Heavy Exercises: Contact a gym!");
                    }

                }
            }
        });
    }

    void showToast(String msg){
        Toast.makeText(suggest_exercise.this,"You can do " + msg,Toast.LENGTH_LONG).show();
    }

    }
