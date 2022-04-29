package com.company;

import com.company.entity.Student;

public class RunMain {
    private static Student[] students = new Student[100];

    public static void main(String[] args) {
        //Show student
        inputNewStudent();
        showAllStudent();
    }

    private static void inputNewStudent() {
        Student student = new Student();
        student.inputStudent();
        saveStudent(student);
    }

    private static void showAllStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                System.out.println(students[i]);
        }
    }

    private static void saveStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                students[i] = student;
            break;
        }
    }
}
