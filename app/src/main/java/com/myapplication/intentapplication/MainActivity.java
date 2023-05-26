package com.myapplication.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sendvalue_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendvalue_button = findViewById(R.id.buttonvalue);

        sendvalue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,IntentReciver.class);
                intent.putExtra("message","Like & Subscribe"); //use to send any value to other activity/screen
                startActivity(intent);
            }
        });

    }
}