package com.company;

import com.company.entity.Rectange;

public class RunMain {
    public static void main(String[] args) {
        Rectange rectange = new Rectange();
        System.out.println("Area value of rectange before input value is " + rectange.findArea());
        System.out.println("Perimeter value of rectange before input value is " + rectange.findPerimeter());
        rectange.createRectange();
        System.out.println("=================================");
        System.out.println(rectange.toString());
        System.out.println("Area value of rectange is " + rectange.findArea());
        System.out.println("Perimeter value of rectange is " + rectange.findPerimeter());
    }
}
