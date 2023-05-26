package com.myapplication.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class IntentReciver extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_reciver);

        editText = findViewById(R.id.textfeild);

        Intent intent = getIntent();
        String val = intent.getStringExtra("message");

        editText.setText(val);
    }
}