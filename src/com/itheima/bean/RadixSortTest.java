package com.itheima.bean;

import java.util.Arrays;

public class RadixSortTest {
    public static void main(String[] args) {
        int[] arr = {23,6,189,45,9,287,56,1,798,34,65,652,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //基数排序（radixSort）
    public static void radixSort(int[] arr) {
        //数组中最大的数
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //计算最大数字是几位数
        int maxLengtn = ("" + max).length();
        //用于临时存储数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录在temp中相应的数组中存放的数字的数量
        int[] counts = new int[10];
        //根据最大长度计算比较次数
        for (int i = 0, n = 1; i < maxLengtn; i++, n *= 10) {
            //每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j]/n%10;
                //把当前遍历的数据放到指定的数组中
                temp[ys][counts[ys]] = arr[j];
                counts[ys]++;
            }

            //记录取的元素需要放的位置
            int index= 0;
            //把数字取出来
            for (int k = 0; k < counts.length; k++) {
                if(counts[k] != 0){
                    for (int l = 0; l < counts[k]; l++) {
                        arr[index] = temp[k][l];
                        index++;
                    }
                    counts[k] = 0;
                }
            }
        }
    }
}
