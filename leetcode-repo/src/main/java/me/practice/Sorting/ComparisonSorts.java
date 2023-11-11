package me.practice.Sorting;

public class ComparisonSorts {
    private int[] array;

    public static int[] bubbleSort(int[] arr){
        boolean hasSwapped = true;
        int temp;

        while(hasSwapped){
            hasSwapped = false;

            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr){

        int min_index, temp;

        for(int i = 0; i < arr.length; i++){
            min_index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int currentIndex = i;
            int temp;

            while(currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]){
                temp = arr[currentIndex - 1];
                arr[currentIndex - 1] = arr[currentIndex];
                arr[currentIndex] = temp;
                currentIndex -= 1;
            }
        }
        return arr;
    }

    public static int[] heapSort(int[] arr){

            // Mutates elements in lst by utilizing the heap data structure
            for (int i = arr.length / 2 - 1; i >= 0; i--) {
                maxHeapify(arr, arr.length, i);
            }
    
            for (int i = arr.length - 1; i > 0; i--) {
                // swap last element with first element
                int temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                // note that we reduce the heap size by 1 every iteration
                maxHeapify(arr, i, 0);
            }
        return arr;
    }
    
    private static void maxHeapify(int[] arr, int heapSize, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }  
        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, heapSize, largest);
        }
    }
}
