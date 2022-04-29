package com.company.entity;

import java.util.Scanner;

public class StudentClass {
    private String id;
    //private String studentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id='" + id + '\'' +
                '}';
    }

    public void inputClass(){
        System.out.print("Input class id : ");
            this.id = new Scanner(System.in).nextLine();
    }
}
