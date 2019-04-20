package com.lbl.basic_day01;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度O(N*logN)，额外空间复杂度O(N)
 */
public class MergeSort {

    public static void sortProcess(int[] arr, int L, int R) {
        if (arr == null || arr.length < 2) {
            return;
        }
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 2);
        sortProcess(arr, L, mid);
        sortProcess(arr, mid + 1, R);

        merge(arr, L, mid, R);

    }

    private static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        //将help数组中的数据拷贝到原数组中
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        sortProcess(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
