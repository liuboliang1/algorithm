package com.lbl.basic_day01;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度O(N^2)，额外空间复杂度O(1)
 */
public class BubbleSort {

    public static void bubbleSortz(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,5,7,3,5,7,8,4,3,0,9,7,3,5,7};
        bubbleSortz(arr);

        System.out.println(Arrays.toString(arr));
    }

}
