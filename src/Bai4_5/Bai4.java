package com.company;

import com.company.entity.MyPoint;

import java.util.Scanner;

public class Bai4 {
    public static MyPoint[] mypoints = new MyPoint[100];

    public static void main(String[] args) {
        input();
        showAll();
        System.out.println(maxDistance());
    }

    //Input value
    private static void input() {
        System.out.print("Nhập n tọa độ: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tọa độ thứ " + (i + 1));
            MyPoint myPoint = new MyPoint();
            //Add point
            myPoint.input();
            //Save point
            savePoint(myPoint);
        }
    }

    //Print out value
    private static void showAll() {
        for (int i = 0; i < mypoints.length; i++) {
            if (mypoints[i] == null) {
                continue;
            }
            System.out.print("Tọa độ thứ " + (i +1) + " : " );
            System.out.println(mypoints[i]);
        }
    }

    //Save value
    private static void savePoint(MyPoint myPoint) {
        for (int i = 0; i < mypoints.length; i++) {
            if (mypoints[i] == null) {
                mypoints[i] = myPoint;
                break;
            }
        }
    }

    //Find max distance
    private static String maxDistance() {
        MyPoint b = new MyPoint(), c = new MyPoint();
        float max = 0f;
        for (int i = 0; i < mypoints.length - 1; i++) {
            for (int j = i + 1; j < mypoints.length; j++) {
                if (mypoints[i] != null && mypoints[j] != null && mypoints[i].distance(mypoints[j]) > max) {
                    max = (float) mypoints[i].distance(mypoints[j]);
                    b = mypoints[i];
                    c = mypoints[j];
                }
            }
        }
        String result = "Hai điểm có khoảng cách lớn nhất là từ " + b + " đến " + c + " .Với khoảng cách = " + Math.round(max) ;
        return result;
    }

}
