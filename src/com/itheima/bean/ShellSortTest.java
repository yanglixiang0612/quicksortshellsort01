package com.itheima.bean;

import java.util.Arrays;

public class ShellSortTest {

    public static void main(String[] args) {
        int[] arr = {3,4,30,69,9,3,1,65,11,66,52,37};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //希尔排序(步长插入法)--也叫：缩小增量排序。  （解决问题（简单插入排序问题）：当需要插入的数是较小的数时，后移的次数明显增多，对效率有影响！）
    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int d = arr.length/2; d > 0 ; d /= 2) {
            for (int i = d; i < arr.length; i++) {
                if(arr[i] < arr[i - d]){
                    temp = arr[i];
                    int j = i;
                    for (j = i - d; j >= 0 && temp < arr[j] ; j -= d) {   //移位法！！
                        arr[j + d] = arr[j];
                    }
                    arr[j + d] = temp;
                }

                /*for (int j = i - d; j >= 0 ; j -= d) {
                    if(arr[j] > arr[j + d]){
                        temp = arr[j];        //交换法：效率低！！  （用移位法！！）
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }*/

            }
        }
    }


}
