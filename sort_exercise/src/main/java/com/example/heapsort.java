package com.example;

/**
 * Created by Jess on 2017/2/16.
 */
public class heapsort {
    private static int[] sort ={1,0,10,20,3,5,6,4,9,8,12,17,34,11,23,32,2,19};
    public static void main(String args[]){
        buildMaxHeapify(sort);
        heapSort(sort);
        print(sort);
    }

    private static void buildMaxHeapify(int[] data){
        int startIndex = getParentIndex(data.length-1);
        for(int i=startIndex;i>=0;i--){
            maxheapify(data,data.length,i);
        }
    }

    private static void maxheapify(int[] data,int heapsize,int index){
        int left =getChildLeft(index);
        int right=getChildRight(index);
        int largest = index;
        if (left<heapsize && data[largest]<data[left]){
            largest = left;
        }
        if (right<heapsize && data[largest]<data[right]){
            largest = right;
        }
        if(largest!=index){
            int temp =data[index];
            data[index]=data[largest];
            data[largest]=temp;
            maxheapify(data,heapsize,largest);
        }
    }

    private static void heapSort(int[] data){
        for(int i=data.length-1;i>0;i--){
            int temp=data[0];
            data[0]=data[i];
            data[i]=temp;
            maxheapify(data,i,0);
        }
    }

    private static void print(int[] data){
        int pre=-2;
        for(int i=0;i<data.length;i++){
            if (pre<(int)getLog(i+1)){
                pre = (int)getLog(i+1);
                System.out.println();
            }
            System.out.print(data[i] + "|");
        }

    }

    private static double getLog(double param){
        return Math.log(param)/Math.log(2);
    }

    private static int getParentIndex(int current){
        return (current-1)>>1;
    }
    private static int getChildLeft(int current){
        return (current<<1)+1;
    }
    private static int getChildRight(int current){
        return (current<<1)+2;
    }
}
