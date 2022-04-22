package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class calorie_results extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_results);
        getSupportActionBar().hide();
        result = findViewById(R.id.textView6);
        int min = 200;
        int max = 300;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

//        int random_int = 9;
        result.setText(random_int+"");


    }
    @Override
    public void onBackPressed() {

        startActivity(new Intent(calorie_results.this,select_options.class));
        finish();
    }

//    class GenerateRandom {
//        public void main( String args[] ) {
//            int min = 50;
//            int max = 100;
//
//            //Generate random int value from 50 to 100
//            System.out.println("Random value in int from "+min+" to "+max+ ":");
//            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//            System.out.println(random_int);
//        }
//    }
}