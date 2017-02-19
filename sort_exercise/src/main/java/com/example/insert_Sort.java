package com.example;

/**
 * Created by Jess on 2017/2/14.
 */
public class insert_Sort {
    public static void main(String args[]) {
        int a[] = {4, 2, 8, 1, 6, 12, 9};
        for (int i = 0; i < 7; i++) {
            int f = 0;
            int temp2 = 0;
            int temp = a[i];

            for (int j = i + 1; j < 7; j++) {

                if (a[j] < temp) {
                    temp = a[j];
                    f = j;
                }
            }

            if (f > 0) {
                temp2 = a[f];
                a[f] = a[i];
                a[i] = temp2;
            }
            for (int h = 0; h < 7; h++) {
                System.out.print(a[h] + "\t");
                if (h == 6) System.out.println();
            }
//        System.out.println(temp);
        }
    }

    public void print() {

    }
}