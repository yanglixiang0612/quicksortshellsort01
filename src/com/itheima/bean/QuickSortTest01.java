package com.itheima.bean;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class QuickSortTest01 {

    public static void main(String[] args) {
        /*int[] arr = {3,1,2,7,9,5,0,15,21,66,23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));*/

        //测试快排的执行速度
        int[] arr1 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr1[i] = (int)(Math.random() * 800000000); //生成一个[0,800000000)的数
        }

        System.out.println("排序前：");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是：" + date1Str);

        quickSort(arr1, 0, arr1.length - 1);

        System.out.println("排序后：");
        Date date2 = new Date();
        //SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String date2Str = simpleDateFormat.format(date2);
        System.out.println("排序后的时间是：" + date2Str);

        System.out.println(Arrays.toString(arr1));


    }

    //快速排序之基准值在左端（法一）
    public static void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];

                while (low < high && stard >= arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
            }

            arr[low] = stard;

            //递归处理基准值左边、右边的数据
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }
}
