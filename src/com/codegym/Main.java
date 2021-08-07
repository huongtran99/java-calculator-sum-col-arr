package com.codegym;

import java.util.Scanner;

public class Main {

    public static double[][] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng dòng trong mảng: ");
        int row = sc.nextInt();
        System.out.print("Nhập số lượng cột trong mảng: ");
        int col = sc.nextInt();

        double array[][] = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập vào phần tử thứ [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }

    public static void showArray(double array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("phần tử thứ [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }

    public static double calculatorSumCol(double array[][], int col) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (col == j) {
                    sum += array[i][col];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[][] = creatArray();
        showArray(array);
        System.out.print("Nhập cột mà bạn muốn tính tổng: ");
        int col = sc.nextInt();
        double sum = calculatorSumCol(array, col);
        System.out.println("Tổng các số ở cột: " + col + " là: " + sum);
    }
}
