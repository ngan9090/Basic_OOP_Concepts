package com.company;

import com.company.entity.Matrix;

import java.util.Scanner;

public class RunMain {
    private static Matrix matrix1 = new Matrix();
    private static Matrix matrix2 = new Matrix();
    private static Matrix matrix3 = new Matrix();
    private static Matrix mt = new Matrix();

    public static void main(String[] args) {
        //All
        choiceOption();
    }

    private static void menu() {
        System.out.println("===============MENU=================");
        System.out.println("1.Nhập giá trị cho hai ma trận. ");
        System.out.println("2.Tính tổng và hiệu hai ma trận.");
        System.out.println("3.Tính tích hai ma trận.");
        System.out.println("4.Tìm chuyển vị của một ma trận.");
        System.out.println("5.Kết thúc chương trình.");
        System.out.println("====================================");
    }

    private static void choiceOption() {
        int choiceOption = 0;
        while(true) {
            menu();
            System.out.print("Xin vui lòng chọn menu: ");
            do {
                choiceOption = new Scanner(System.in).nextInt();
                if (choiceOption < 1 || choiceOption > 5) {
                    System.out.println("Xin vui lòng nhập lại giá trị từ 1 đến 5: ");
                }
            } while (choiceOption < 1 || choiceOption > 5);
            switch (choiceOption) {
                case 1:
                    matrix1.input("1");
                    matrix2.input("2");
                    break;
                case 2:
                    mt = matrix1.add(matrix2);
                    mt.print("tổng");
                    mt = matrix1.sub(matrix2);
                    mt.print("hiệu");
                    break;
                case 3:
                    mt = matrix1.mul(matrix2);
                    mt.print("tích");
                    break;
                case 4:
                    matrix1.input("muốn chuyển vị");
                    mt = matrix1.transpose();
                    mt.print("chuyển vị");
                    break;
                case 5:
                    return;
            }
        }
    }

}
