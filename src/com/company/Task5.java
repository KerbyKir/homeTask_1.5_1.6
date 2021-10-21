package com.company;

public class Task5 {
    public static void main(String[] args) {
        /* #5: Создайте матрицу 3х3 (двумерный массив типа int).
Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
Постарайтесь заполнить обе диагонали в одном цикле */

        int[][] matrix = new int[3][3];
        int value = 1;

        for(int i=0;i<3;i++){
            if(i%2==0) {
                matrix[i][0] = value;
                matrix[i][2] = value;
            } else {
                matrix[i][1]=value;
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
