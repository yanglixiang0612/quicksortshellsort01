package com.itheima.bean;

import java.util.Arrays;

public class InsertSortTest {

    public static void main(String[] args) {
        int[] arr = {3,4,2,69,9,3,1,17,11,66,52,37};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //插入排序
    public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                int temp = arr[i];
                int j;
                for(j = i - 1; j >= 0 && temp < arr[j]; j--){   //移位法!
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }

            /*for (int j = i - 1; j >=0; j--) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];          //交换法：效率低！！  （用移位法！！）
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }*/
        }
    }
}
