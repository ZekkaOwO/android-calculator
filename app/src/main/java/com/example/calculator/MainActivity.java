package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void plus(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(String.valueOf(number1.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2.getText()));
        int ans = num1 + num2;
        String str = Integer.toString(ans);

        goToActivity2(str);
    }

    public void minus(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(String.valueOf(number1.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2.getText()));
        int ans = num1 - num2;
        String str = Integer.toString(ans);

        goToActivity2(str);
    }

    public void times(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(String.valueOf(number1.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2.getText()));
        int ans = num1 * num2;
        String str = Integer.toString(ans);

        goToActivity2(str);
    }

    public void divide(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(String.valueOf(number1.getText()));
        int num2 = Integer.parseInt(String.valueOf(number2.getText()));
        int ans = num1 / num2;
        String str = Integer.toString(ans);

        goToActivity2(str);
    }

    public void goToActivity2(String ans){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", ans);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}