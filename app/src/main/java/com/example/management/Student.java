package com.example.management;


public class Student {
    private String name, subject;
    private int marks;

    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getSubject() { return subject; }
    public int getMarks() { return marks; }
}

