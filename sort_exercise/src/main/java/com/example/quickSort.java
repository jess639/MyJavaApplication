package com.example;

/**
 * Created by Jess on 2017/2/16.
 */
public class quickSort {
    public static void main(String args[]){
        int[] a ={7,0,10,20,3,5,6};
        sort(a,0,a.length-1);
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+"\t");
//        }
    }
    public static void sort(int[] data,int low,int high){
        int l=low;
        int h=high;
        int povit=data[low];

        while(l<h){

            while (l<h && data[h]>povit)
             h--;
                if (data[h]<povit){
                    int temp =data[h];
                    data[h]=data[l];
                    data[l]=temp;
                    l++;
//                    for (int k = 0; k < data.length; k++) {
//                        System.out.print(data[k] + "\t");
//                        if (k == data.length - 1) System.out.println();
//                    }
                }

            while (l<h && data[l]<povit)
                l++;
                if(data[l]>povit){
                    int temp =data[l];
                    data[l]=data[h];
                    data[h]=temp;
                    h--;
//                    for (int k = 0; k < data.length; k++) {
//                        System.out.print(data[k] + "\t");
//                        if (k == data.length - 1) System.out.println();
//                    }
                }

            if(l>low)sort(data,low,l-1);
            if(h<high)sort(data,l+1,high);



        }



    };


}
