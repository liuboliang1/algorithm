package com.lbl.basic_day01;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }

    }

    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void heapify(int[] arr, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largest = (left + 1) < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            largest = arr[index] > arr[largest] ? index : largest;
            if (index == largest) {
                break;
            }
            swap(arr,index,largest);
            index = largest;
            left = 2 * index + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 5, 7, 3, 5, 7, 8, 4, 3, 0, 9, 7, 3, 5, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
