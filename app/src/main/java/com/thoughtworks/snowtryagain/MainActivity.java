package com.thoughtworks.snowtryagain;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button0);
        button.setOnClickListener(v -> openNewActivity());
    }

    public void openNewActivity() {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }
}