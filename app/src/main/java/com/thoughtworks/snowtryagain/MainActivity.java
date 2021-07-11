package com.thoughtworks.snowtryagain;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // If the Android version is lower than Jellybean, use this call to hide
        // the status bar.
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button0);
        button.setOnClickListener(v -> openNewActivity());

        button2 = findViewById(R.id.button1);
        button2.setOnClickListener(v -> openNewActivity2());
    }

    public void openNewActivity() {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    public void openNewActivity2() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}