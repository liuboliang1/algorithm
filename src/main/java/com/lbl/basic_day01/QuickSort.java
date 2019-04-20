package com.lbl.basic_day01;

import java.util.Arrays;

/**
 * 随机快速排序的细节和复杂度分析
 * 可以用荷兰国旗问题来改进快速排序
 * 时间复杂度O(N*logN)，额外空间复杂度O(logN)
 */
public class QuickSort {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }


    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;

        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
