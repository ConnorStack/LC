package me.practice.Sorting;

public class SortingScratchClass {

    public static int[] insertionSortPrac(int[] arr){
        int temp, currentIndex;

        for (int i = 1; i < arr.length; i++) {
            currentIndex = i;
            while(arr[currentIndex] > arr[currentIndex-1] && currentIndex > 0){
                temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex-1];
                arr[currentIndex-1] = temp;
                currentIndex -= 1;
            }
        }
        
        return arr;
    }

    public static int[] heapSortPrac(int[] arr){
        //first heapify the array in-place
        for (int i = arr.length/2 - 1 ; i >= 0; i--) {
            maxHeapify(arr, arr.length, i);
        }

        for (int i = arr.length-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            maxHeapify(arr, i, 0);
        }


        return arr;
    }

    private static void maxHeapify(int[] arr, int heapSize, int index){
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;

        if(left < heapSize && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < heapSize && arr[right] > arr[largest]){
            largest = right;
        }
        if(index != largest){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            maxHeapify(arr, heapSize, largest);
        }
    }
}
