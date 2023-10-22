package com.kilumbu.mutheu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enableDevOptionsButton = findViewById(R.id.enableDevOptionsButton);

        enableDevOptionsButton.setOnClickListener(v -> {
            // Open the developer options settings activity
            Intent intent = new Intent(android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
            startActivity(intent);
        });

    }
}