package com.example;

/**
 * Created by Jess on 2017/2/9.
 */
public class helf_insert {
    public static void main(String args[]){
        int a[]={7,4,8,3,6,5,9};
        for(int i=1;i<a.length;i++){
            int b=a[i];
            int low =0;
            int high =i-1;
            while (low<=high){
                int m=(low+high)/2;
                if(a[m]<b)low=m+1;
                else high=m-1;
            }
            System.out.println("high=" + high + ",low=" + low);
            for(int j=i-1;j>=high+1;--j)a[j+1]=a[j];
            a[high+1]=b;
            for(int j=0;j<7;j++){
                System.out.print(a[j] + "\t");if(j==6) System.out.println();
            }
        }
//        System.out.print("the sorted array is : a = ");

    }
}
