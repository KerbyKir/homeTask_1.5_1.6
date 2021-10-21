package com.company;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
    /* #8: Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
Необходимо найти два числа, сумма которых равна −2.
Напечатать эти числа в консоль.*/
        int [] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean isEnd = false;

        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==-2) {
                    System.out.println("Сумма чисел "+arr[i]+" и "+arr[j]+" равна -2");
                    isEnd=true;
                    break;
                }
            }
            if(isEnd) {
                break;
            }
        }
    }
}
