package com.example.management;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MarksheetActivity extends AppCompatActivity {

    ListView listView;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksheet);

        listView = findViewById(R.id.listView);
        db = new DatabaseHelper(this);

        ArrayList<String> data = new ArrayList<>();
        for (Student s : db.getAllStudents()) {
            data.add(s.getName() + " | " + s.getSubject() + " | " + s.getMarks());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}
