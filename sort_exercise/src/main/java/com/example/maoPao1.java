package com.example;

/**
 * Created by Jess on 2017/2/15.
 */
public class maoPao1 {
    public static void sort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int h = 0; h < a.length; h++) {
                System.out.print(a[h] + "\t");
                if (h == a.length - 1) System.out.println();
            }
        }
    }


    public static void main(String args[]) {
        int a[] = {7, 9, 8, 3, 6, 5, 17, 1, 2, 4, 10};
        sort(a);
    }
}
