package com.company;

import com.company.entity.Student;
import com.company.entity.StudentClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class RunMain {
    private static Student[] students = new Student[100];
    private static StudentClass[] studentClasses = new StudentClass[10];

    public static void main(String[] args) {
        //Show student
        choiceOption();
    }

    private static void menu() {
        System.out.println("============Menu=============");
        System.out.println("Choice option from 1 to 6. ");
        System.out.println("1.Input n student.");
        System.out.println("2.Print out student list.");
        System.out.println("3.Arrange student list by name.");
        System.out.println("4.Input n class.");
        System.out.println("5.Print out student list group by class. ");
        System.out.println("6.Exit");
        System.out.println("============================");
        System.out.print("Enter your choice : ");
    }

    private static void choiceOption() {
        while (true) {
            menu();
            int choice = -1;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice < 0 || choice > 6)
                    System.out.print("Choice option from 1 to 6. ");
            }
            while (choice < 0 || choice > 6);
            switch (choice) {
                case 1:
                    inputNewStudent();
                    break;
                case 2:
                    showAllStudent();
                    break;
                case 3:
                    arrangeByName();
                    showAllStudent();
                    break;
                case 4:
                    inputNewClass();
                    break;
                case 5:
                    showByClass();
                    break;
                case 6:
                    return;
            }
        }
    }

    private static void inputNewStudent() {
        System.out.print("Input n student : ");
        int studentNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Input student number " + (i + 1));
            Student student = new Student();
            //Add Student
            student.inputStudent();
            //Save Student
            saveStudent(student);
        }
    }

    private static void showAllStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            System.out.println(students[i]);
        }
    }

    private static void saveStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    private static void arrangeByName() {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i] != null && students[j] != null && students[i].getName().toUpperCase().compareTo(students[j].getName().toUpperCase()) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    private static void inputNewClass() {
        System.out.print("Input n class : ");
        int studentNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Input class number " + (i + 1));
            StudentClass studentClass = new StudentClass();
            //Add Student
            studentClass.inputClass();
            //Save Student
            saveClass(studentClass);
        }
    }

    private static void showByClass() {
        int count = 0;
        for (int i = 0; i < studentClasses.length; i++) {
            if(studentClasses[i] != null){
                count++;
            }
        }
        int countStudent = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                countStudent++;
            }
        }

        for (int i = 0; i < count; i++) {
            int countSum = 0;
            int countHave = 0;
            System.out.println("+ " +studentClasses[i]);
            for (int j = 0; j < countStudent; j++) {
                if (studentClasses[i] != null && students[j] != null && studentClasses[i].getId().equals(students[j].getStudentClass())) {
                    System.out.println(students[j]);
                    countHave++;
                }else{
                    countSum++;
                }
            }
            if((countSum > 0) && (countHave == 0)){
                System.out.println("Class not yet have student. ");
            }
        }
    }

    private static void saveClass(StudentClass studentClass) {
        for (int i = 0; i < studentClasses.length; i++) {
            if (studentClasses[i] == null) {
                studentClasses[i] = studentClass;
                break;
            }
        }
    }

    private static void showAllClass() {
        for (int i = 0; i < studentClasses.length; i++) {
            if (studentClasses[i] == null) {
                continue;
            }
            System.out.println("show" +studentClasses[i]);
        }
    }
}
