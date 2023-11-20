package me.practice.Sorting;

import java.util.Arrays;

public class SortingScratchClass {

    public static int[] insertionSortPrac(int[] arr) {
        int current, temp;

        for (int i = 1; i < arr.length; i++) {
            current = i;

            while((current > 0) && (arr[current] < arr[current-1])){
                temp = arr[current];
                arr[current] = arr[current - 1];
                arr[current - 1] = temp;
                current--;
            }
        }
        return arr;
    }

    public static int[] bubbleSortPrac(int[] arr){
        boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    hasSwapped = true;
                }
            }
        }
        return arr;
    }

    public static int[] selectSortPrac(int[] arr){
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // public static int[] heapSortPrac(int[] arr) {
    //     // first heapify the array in-place
    //     for (int i = arr.length / 2 - 1; i >= 0; i--) {
    //         maxHeapify(arr, arr.length, i);
    //     }

    //     for (int i = arr.length - 1; i > 0; i--) {
    //         int temp = arr[i];
    //         arr[i] = arr[0];
    //         arr[0] = temp;
    //         maxHeapify(arr, i, 0);
    //     }

    //     return arr;
    // }

    // private static void maxHeapify(int[] arr, int heapSize, int index) {
    //     int left = index * 2 + 1;
    //     int right = index * 2 + 2;
    //     int largest = index;

    //     if (left < heapSize && arr[left] > arr[largest]) {
    //         largest = left;
    //     }
    //     if (right < heapSize && arr[right] > arr[largest]) {
    //         largest = right;
    //     }
    //     if (index != largest) {
    //         int temp = arr[largest];
    //         arr[largest] = arr[index];
    //         arr[index] = temp;
    //         maxHeapify(arr, heapSize, largest);
    //     }
    // }

    public static int[] countSortPrac(int[] unsortedArr) {
        int[] sortedArr = new int[unsortedArr.length];

        int k = Arrays.stream(unsortedArr).max().getAsInt();
        int[] counts = new int[k + 1];

        for (int n : unsortedArr) {
            counts[n]++;
        }

        int accumulator = 0;
        int[] startingIndicies = new int[k + 1];
        for (int i = 0; i < counts.length; i++) {
            startingIndicies[i] = accumulator;
            accumulator += counts[i];
        }

        int unsortedValue, insertIndex;
        for (int i = 0; i < sortedArr.length; i++) {
            unsortedValue = unsortedArr[i];
            insertIndex = startingIndicies[unsortedValue];
            sortedArr[insertIndex] = unsortedValue;

            startingIndicies[unsortedValue]++;
        }

        return sortedArr;
    }

    public static int[] countSortPractice(int[] arr) {
        int[] sortedArr = new int[arr.length];
        int k = Arrays.stream(arr).max().getAsInt();

        int[] counts = new int[k + 1];
        int[] startingIndex = new int[k + 1];

        for (int element : arr) {
            counts[element] += 1;
        }

        int accum = 0;
        for (int i = 0; i < counts.length; i++) {
            startingIndex[i] = accum;
            accum += counts[i];
        }

        for (int i = 0; i < sortedArr.length; i++) {
            // {0, 0, 4, 2, 4, 5, 2, 1, 0};
            int pulledValue = arr[i];
            int element = startingIndex[pulledValue];
            startingIndex[pulledValue]++;
            sortedArr[element] = pulledValue;
        }

        return sortedArr;
    }

    public static int[] heapSortPrac(int[] arr){

        //first iterate on the array and heapify each node, starting at the non leaf nodes
        for(int i = arr.length/2-1; i >= 0; i--){
            maxHeapify(arr, arr.length, i);
        }

        for(int i = arr.length-1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, i, 0);
        }


        //next, once the array is heapified, we want to swap the head and tail of the array, exclude the now sorted tail
        //shrink the array by 1 (not literally, but change the scope by length-1)
        //Now that the root of the tree is new, we want to heapify this
        return arr;
    } 

    public static void maxHeapify(int[] arr, int heapSize, int index){
        //determine left and right node values, 
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;

        //if left or right is greater than the largest, replace it. 
        //make sure our left and right are within range of heapSize
        if(left < heapSize && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < heapSize && arr[right] > arr[largest]){
            largest = right;
        }
        //swap and call maxheap again 
        if(index != largest){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, heapSize, largest);
        }


    }

}
