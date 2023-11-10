package me.practice.Sorting;

public class SelectSort {

    public static int[] sort(int[] arr) {
        int min_index = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
