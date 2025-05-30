package com.example.management;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAddMarks, btnViewMarksheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddMarks = findViewById(R.id.btnAddMarks);
        btnViewMarksheet = findViewById(R.id.btnViewMarksheet);

        btnAddMarks.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AddMarksActivity.class)));

        btnViewMarksheet.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, MarksheetActivity.class)));
    }
}