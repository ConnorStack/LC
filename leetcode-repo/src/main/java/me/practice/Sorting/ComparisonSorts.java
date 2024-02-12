package me.practice.Sorting;

public class ComparisonSorts {
    private int[] array;

    public static int[] bubbleSort(int[] arr) {
        boolean hasSwapped = true;
        int temp;

        while (hasSwapped) {
            hasSwapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr) {

        int min_index, temp;

        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            int temp;

            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                temp = arr[currentIndex - 1];
                arr[currentIndex - 1] = arr[currentIndex];
                arr[currentIndex] = temp;
                currentIndex -= 1;
            }
        }
        return arr;
    }

    public static int[] heapSort(int[] arr) {

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

    public static int[] heapSortPractice(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapifyPractice(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            maxHeapifyPractice(arr, i, 0);
        }
        return arr;
    }

    private static void maxHeapifyPractice(int[] arr, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            maxHeapifyPractice(arr, heapSize, largest);
        }
    }
}

/*
 * for every non leaf node
 * int i = array.length
 * i / 2 - 1, decrement until 0
 * Determine if the parent node is larger than or equal to the children nodes
 * Accomplish this by a maxHeapify
 * 
 * Given the array, the size, and the index...
 * Determine the left and right elements of the children
 * left = index * 2 + 1
 * right = index * 2 + 2
 * set largest to the parent node
 * largest = array[parent node, in this case just index]
 * 
 * if the left element is within range of our array, then it exists and can be
 * checked
 * it should be compared to the parent to determine the larger value
 * 
 * if the right element is within range of our array, then it exists and can be
 * compared
 * it should be compared to the parent
 * 
 * if the largest value has changed, swap it with the parent value
 */
