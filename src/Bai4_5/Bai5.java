package com.company;

import com.company.entity.MyPoint;

import java.util.Scanner;

public class Bai5 {
    public static MyPoint[] mypoints = new MyPoint[3];

    public static void main(String[] args) {
        input();
        showAll();
        checkTriangle();
    }

    //Input value to mypoints
    private static void input() {
        System.out.println("Nhập 3 tọa độ: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập tọa độ thứ " + (i + 1));
            MyPoint myPoint = new MyPoint();
            //Add point
            myPoint.input();
            //Save point
            savePoint(myPoint);
        }
    }

    //Save value to mypoints
    private static void savePoint(MyPoint myPoint) {
        for (int i = 0; i < mypoints.length; i++) {
            if (mypoints[i] == null) {
                mypoints[i] = myPoint;
                break;
            }
        }
    }

    //Print out value
    private static void showAll() {
        for (int i = 0; i < mypoints.length; i++) {
            if (mypoints[i] == null) {
                continue;
            }
            System.out.print("Tọa độ thứ " + (i + 1) + " : ");
            System.out.println(mypoints[i]);
        }
    }

    //Check this is triangle or not
    private static void checkTriangle() {
        double a = mypoints[0].distance(mypoints[1]);
        double b = mypoints[1].distance(mypoints[2]);
        double c = mypoints[2].distance(mypoints[0]);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều!");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giác vuông!");
            } else if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
        } else {
            System.out.println("Đây không phải là tam giác.");
        }
    }
}
