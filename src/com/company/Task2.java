package com.company;

public class Task2 {
    public static void main(String[] args) {
        /* #2: Следующая задача — найти минимальную и максимальную трату за день.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/

        int[] arr = generateRandomArray();
        int minForMonth = 200_000;
        int maxForMonth = 0;

        for (int j : arr) {
            if (j > maxForMonth) {
                maxForMonth = j;
            } else if (j < minForMonth) {
                minForMonth = j;
            }
        }
        System.out.print("Минимальная сумма трат за день составила "+minForMonth+" рублей." +
            " Максимальная сумма трат за день составила "+maxForMonth+" рублей");
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
