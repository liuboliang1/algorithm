package com.lbl.basic_day01;

/**
 * 求数组中的最大值
 */
public class MaxOfArray {

    public static int maxOfArray(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        //left和right中间的位置 等价于 (left + right)/2
        int mid = left + ((right - left) >> 2);
        int maxLeft = maxOfArray(arr, left, mid);
        int maxRight = maxOfArray(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        int max = maxOfArray(arr, 0, arr.length - 1);
        System.out.println(max);

    }
}
