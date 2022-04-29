package com.company.entity;

import java.util.Scanner;

public class MyPoint {
    private double x;
    protected double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Copy
    public MyPoint(MyPoint p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tọa độ{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt(Math.pow((this.x - secondPoint.x), 2) + Math.pow((this.y - secondPoint.y), 2));
    }

    public double distance(MyPoint p1,MyPoint p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }

    public void input(){
            System.out.print("Nhập x: ");
            setX(new Scanner(System.in).nextDouble());
            System.out.print("Nhập x: ");
            setY(new Scanner(System.in).nextDouble());
    }

}
