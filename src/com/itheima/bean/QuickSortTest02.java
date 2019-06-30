package com.itheima.bean;

import java.util.Arrays;

public class QuickSortTest02 {

    public static void main(String[] args) {
        int[] arr = {3,4,2,67,9,5,0,15,11,66,32,36};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序之基准值在中间(法二)
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right)/2];  //中间值
        int temp = 0;
        while(l < r){
            while(arr[l] < pivot){
                l++;
            }
            while(arr[r] > pivot){
                r--;
            }
            if(l >= r){
                break;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l] == pivot){
                r--;
            }
            if(arr[r] == pivot){
                l++;
            }
        }

        if(l == r){
            l++;
            r--;      //否则会栈溢出
        }

        //向左递归
        if(left < r){
            quickSort(arr, left, r);
        }
        //向右递归
        if(l < right){
            quickSort(arr, l, right);
        }

    }
}
