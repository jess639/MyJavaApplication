package com.example;

/**
 * Created by Jess on 2017/2/15.
 */
public class shellSort {
    public static void main(String args[]) {
        int[] a = {9, 2, 8, 1, 6, 5, 4};
        int step = 6;
        while (true) {
            for (int i = 0; i + step < 7; i++) {
                for (int j = i; j + step < 7; j = j + step) {
                    int temp = 0;
                    if (a[j] > a[j + step]) {
                        temp = a[j];
                        a[j] = a[j + step];
                        a[j + step] = temp;
                    }
                }

                for (int h = 0; h < 7; h++) {
                    System.out.print(a[h] + "\t");
                    if (h == 6) System.out.println();
                }
            }

            if (step == 1) break;
            step--;


        }


        for (int h = 0; h < 7; h++) {
            System.out.print(a[h] + "\t");
        }


    }
}
