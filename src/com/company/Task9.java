package com.company;

public class Task9 {
    public static void main(String[] args) {
        /* #9: Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль
*/
        int [] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==-2) {
                    System.out.println("Сумма чисел "+arr[i]+" и "+arr[j]+" равна -2");
                }
            }
        }
    }
}
