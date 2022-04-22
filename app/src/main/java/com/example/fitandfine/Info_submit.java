package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Info_submit extends AppCompatActivity {

    TextView textView2;
    TextInputEditText editTextTextPersonName,editTextGender,editTextAge,editTextNumberHeight,editTextNumberWeight;
    Button submit_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_submit);
        getSupportActionBar().hide();

        submit_button = findViewById(R.id.submit_button);

        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextGender = findViewById(R.id.editTextGender);
        editTextAge = findViewById(R.id.editTextAge);
        editTextNumberHeight = findViewById(R.id.editTextHeight);
        editTextNumberWeight = findViewById(R.id.editTextWeight);

        submit_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = editTextTextPersonName.getText().toString().trim();
                String gender = editTextGender.getText().toString().trim();
                String age = editTextAge.getText().toString().trim();
                String height = editTextNumberHeight.getText().toString().trim();
                String weight = editTextNumberWeight.getText().toString().trim();
                if(name.isEmpty() || gender.isEmpty() || age.isEmpty() || height.isEmpty() || weight.isEmpty()){
                    Toast.makeText(Info_submit.this, "All fields are mandatory!", Toast.LENGTH_SHORT).show();
                    if(name.isEmpty()) {
                        editTextTextPersonName.setError( "This field is required!" );
                    }
                    if(gender.isEmpty()){
                        editTextGender.setError( "This field is required!" );
                    }
                    if(age.isEmpty()){
                        editTextAge.setError( "This field is required!" );
                    }
                    if(height.isEmpty()){
                        editTextNumberHeight.setError( "This field is required!" );
                    }
                    if(weight.isEmpty()){
                        editTextNumberWeight.setError( "This field is required!" );
                    }
                }
                else{
                    startActivity(new Intent(getApplicationContext(), select_options.class));
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Info_submit.this,MainActivity.class));
        finish();
    }
}