package me.practice.Sorting;

public class DivideAndConquerSorting {

    public static int[] quickSort(int[] arr) {

        return arr;
    }

    public static int lomutosPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        // initially set i just before the arr's first element
        // in the case that no elementis less than pivot, the final swap will work as
        // expected
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr[i], arr[j]);
            }
        }

        swap(arr[i + 1], arr[high]);

        return i + 1;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
