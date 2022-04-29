package com.company.entity;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String studentClass;
    private String course;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
    public void inputStudent(){
        System.out.print("Input student id : ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Input student name : ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Input student class : ");
        this.studentClass = new Scanner(System.in).nextLine();
        System.out.print("Input student course : ");
        this.course = new Scanner(System.in).nextLine();
    }
}
