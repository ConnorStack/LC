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
}
