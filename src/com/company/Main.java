package com.company;

import java.io.PrintStream;
import java.util.Arrays;









public class Main {

    public static void main(String[] args) {
        //swapZeroToOne();
        //fillArray();
        //lessThanSix();
        //diagonalArray();
        MinMax();

    }
    //Создать рандомное целое число
    private static int randomNumber(int x) {
        int a = (int) (Math.random() * x);
        return a;
    }
    private static void MinMax(){


        int arr[] = new int [10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber(100);
        }
        System.out.println("Массив arr состоит из: " + Arrays.toString(arr));
        int
    }


    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void swapZeroToOne() {
        int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber(2);
            System.out.println("Старое значение array[" + i + "] = " + arr[i]);
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println("Новое значение array[" + i + "] = " + arr[i]);
        }
    }

    //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void fillArray() {
        int arr[] = new int[8];
        int testArr[] = {0, 3, 6, 9, 12, 15, 18, 21};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = testArr[i];
            System.out.println("arrayTwo[" + i + "] = " + arr[i]);
        }
    }


    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void lessThanSix() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println("arrayThree[" + i + "] = " + arr[i]);
            } else
                System.out.println("arrayThree[" + i + "] = " + arr[i]);

        }
    }

    //Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void diagonalArray() {

        int arr[][] = new int[3][3];
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = counter;
                if (arr[i][j] % 2 == 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //Задать одномерный массив и найти в нем
    // минимальный и максимальный элементы (без помощи интернета);



}