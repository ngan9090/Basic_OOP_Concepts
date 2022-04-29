package com.company.entity;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private float[][] a;
    private int rows;
    private int cols;

    public float[][] getA() {
        return a;
    }

    public void setA(float[][] a) {
        this.a = a;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Matrix() {
        this.rows = Value.ROW;
        this.cols = Value.COLUMN;
        a = new float[this.rows][this.cols];
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        a = new float[rows][cols];
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "a=" + Arrays.toString(a) +
                ", row=" + rows +
                ", col=" + cols +
                '}';
    }

    public void print(String nameMatrix) {
        System.out.println("Bên dưới là ma trận " + nameMatrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void input(String nameMatrix) {
        System.out.println("Ma trận " + nameMatrix);
        System.out.print("Enter rows: ");
        rows = new Scanner(System.in).nextInt();
        System.out.print("Enter columns: ");
        cols = new Scanner(System.in).nextInt();
        a = new float[rows][cols];
        System.out.println("Nhap vao gia tri cho ma tran " + nameMatrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\tPhan tu thu [" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("****************************");
        System.out.println();
    }

    public Matrix add(Matrix m) {
        Matrix matrixSum = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixSum.a[i][j] = a[i][j] + m.a[i][j];
            }
        }
        return matrixSum;
    }

    public Matrix sub(Matrix m) {
        Matrix matrixSum = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixSum.a[i][j] = a[i][j] - m.a[i][j];
            }
        }
        return matrixSum;
    }

    public Matrix mul(Matrix m) {
        Matrix matrixSum = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixSum.a[i][j] = a[i][j] * m.a[i][j];
            }
        }
        return matrixSum;
    }

    public Matrix neg() {
        Matrix matrixNeg = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] != 0) {
                    matrixNeg.a[i][j] = -(a[i][j]);
                } else
                    matrixNeg.a[i][j] = 0;
            }
        }
        return matrixNeg;
    }

    public Matrix transpose() {
        Matrix matrixTranspose = new Matrix(cols, rows);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                matrixTranspose.a[i][j] = a[j][i];
            }
        }
        return matrixTranspose;
    }


}
