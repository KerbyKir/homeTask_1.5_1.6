package com.company;

public class Task1 {
    public static void main(String[] args) {
        /* #1: Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Сумма трат за месяц составила … рублей». */

        int[] arr = generateRandomArray();
        int sumForMonth = 0;

        for (int j : arr) {
            sumForMonth += j;
        }
        System.out.print("Сумма трат за месяц составила "+sumForMonth+" рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
