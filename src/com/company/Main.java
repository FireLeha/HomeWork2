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

        int[] array1 = {2, 2, 2, 1, 2, 2, 10, 1};
        equalSum(array1);
        System.out.println(equalSum(array1));



    }

    //Вспомогательный метод для создания рандомного целого числа.
    private static int randomNumber(int x) {
        int a = (int) (Math.random() * x);
        return a;
    }
// НЕ УСПЕЛ СДЕЛАТЬ!!!!!
    //Вспомогательный метод для создания рандомного целого положительного или отрицательного числа.
//    private static int randomNumber2(int x) {
//        int a = (int) (Math.random(-x) * x);
//        return a;
//    }


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
    private static void MinMax() {


        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber(100);

        }
        int min = arr[0];//Теперь не работает!? //int min = 100; - так работает.
        int max = arr[0];//А вот здесь работает! //int max = 0; - так работает.
        System.out.println("Массив arr состоит из: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Самое маленькое число в массиве: " + min);
        System.out.println("Самое большое число в массиве: " + max);
    }

    //Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой
    // и правой части массива равны. Примеры:
    // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) > true, checkBalance([1, 1, 1, || 2, 1]) > true,
    // граница показана символами ||, эти символы в массив не входят.

    private static boolean equalSum(int[] array) {
        System.out.println(Arrays.toString(array));
        int first = 0;
        int second = 0;

        for (int i : array) {
            second += i;
        }

        for (int i = 0; i < array.length; i++) {
            if (first == second) {
                return true;
            }
            first += array[i];
            second -= array[i];
        }
        return false;
    }

    // НЕ УСПЕЛ СДЕЛАТЬ!!!!!
    //Написать метод, которому на вход подается одномерный массив
    // и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    // вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.


}
