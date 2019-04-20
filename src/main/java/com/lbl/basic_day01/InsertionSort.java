package com.lbl.basic_day01;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度O(N^2)，额外空间复杂度O(1)
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
