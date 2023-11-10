package me.practice.Sorting;

public class BubbleSort {
    
    public static int[] sort(int[] arr){
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
}
