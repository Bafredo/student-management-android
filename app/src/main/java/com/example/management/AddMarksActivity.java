package com.example.management;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddMarksActivity extends AppCompatActivity {

    EditText etName, etSubject, etMarks;
    Button btnSave;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_marks);

        etName = findViewById(R.id.etName);
        etSubject = findViewById(R.id.etSubject);
        etMarks = findViewById(R.id.etMarks);
        btnSave = findViewById(R.id.btnSave);
        db = new DatabaseHelper(this);

        btnSave.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String subject = etSubject.getText().toString().trim();
            String marksStr = etMarks.getText().toString().trim();

            if (!name.isEmpty() && !subject.isEmpty() && !marksStr.isEmpty()) {
                int marks = Integer.parseInt(marksStr);
                db.insertStudent(new Student(name, subject, marks));
                Toast.makeText(this, "Marks added", Toast.LENGTH_SHORT).show();
                etName.setText("");
                etSubject.setText("");
                etMarks.setText("");
            } else {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
