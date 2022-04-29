package com.company.entity;

import java.util.Scanner;

public class Rectange {
    private double width;
    private double height;
    private String color;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectange() {
        this.width = ValueRectange.WIDTH;
        this.height = ValueRectange.HEIGHT;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectange Attribute{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public double findArea() {
        double findArea = this.width * this.height;
        return findArea;
    }

    public double findPerimeter() {
        double findPerimeter = (this.width + this.height) * 2;
        return findPerimeter;
    }

    public void createRectange() {
        System.out.println("Input rectange attributes");
        System.out.print("Input width of rectange: ");
        this.width = new Scanner(System.in).nextDouble();
        System.out.print("Input height of rectange: ");
        this.height = new Scanner(System.in).nextDouble();
        System.out.print("Input color of rectange: ");
        this.color = new Scanner(System.in).nextLine();
    }

}
