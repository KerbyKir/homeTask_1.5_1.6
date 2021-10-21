package com.company;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        /* #7: У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
Нам дан массив чисел: {5, 4, 3, 2, 1}
Необходимо привести его к виду: {1, 2, 3, 4, 5}
Решите задачу без использования дополнительного массива.
Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
Напечатайте массив до преобразования и после с помощью
System.out.println(Arrays.toString(arr));*/

        int[] arr = {5, 4, 3, 2, 1};
        int addValue;

        System.out.println("До преобразования: " + Arrays.toString(arr));

        for (int i = 0; i < (arr.length/2); i++) {
            addValue=arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = arr[i];
            arr[i]=addValue;
        }

        System.out.println("После преобразования: " + Arrays.toString(arr));
    }
}
