package ua.opnu;

import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private ArrayList<String> courses;

    // Конструктор
    Student(String name, int year) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        if (year < 1 || year > 4) {
            this.year = 1;
        } else {
            this.year = year;
        }

        this.courses = new ArrayList<>();
    }

    void addCourse(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) return;
        courses.add(courseName);
    }

    void dropAll() {
        courses.clear();
    }

    int getCourseCount() {
        return courses.size();
    }

    String getName() {
        return name;
    }

    int getTuition() {
        return year * 20000;
    }

    int getYear() {
        return year;
    }
}
