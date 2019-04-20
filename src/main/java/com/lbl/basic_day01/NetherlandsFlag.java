package com.lbl.basic_day01;

import java.util.Arrays;

/**
 * （荷兰国旗问题）:
 * 给定一个数组arr，和一个数num，请把小于num的数放在数组的 左边，等于num的数放在数组的中间，大于num的数放在数组的右边。
 */
public class NetherlandsFlag {

    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R + 1;
        int curr = L;

        while (curr < more) {
            if (arr[curr] < num) {
                swap(arr, ++less, curr++);
            } else if (arr[curr] > num) {
                swap(arr, --more, curr);
            } else {
                curr++;
            }
        }
        return new int[]{less + 1, more - 1};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        partition(arr, 0, arr.length - 1, 7);
        System.out.println(Arrays.toString(arr));
    }

}
