package com.example;

/**
 * Created by Jess on 2017/2/17.
 */
public class insert {
    public static void main(String args[]) {
        int[] a = {6, 4, 2, 3, 8, 5};
        print(a,a.length);
    }

    public static void print(int[] a, int n) {

        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            while (a[j] > temp) {
                a[j + 1] = a[j];
                j--;
                if (j == -1) break;
            }
            a[j + 1] = temp;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + "\t");
            if (k == a.length - 1) System.out.println();
        }
    }
}
