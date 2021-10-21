package com.company;

public class Task3 {
    public static void main(String[] args) {
        /* #3: А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
Нужно написать программу, которая посчитает среднее значение трат за месяц
(то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
 «Средняя сумма трат за месяц составила … рублей».*/

        int[] arr = generateRandomArray();
        float avgForMonth = 0f;

        for (int i=0; i<arr.length; i++) {
            avgForMonth+=arr[i];
            if(i==arr.length-1) {
                avgForMonth=(avgForMonth+arr[i])/arr.length;
            }
        }
        System.out.print("Средняя сумма трат за месяц составила "+avgForMonth+" рублей");
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
