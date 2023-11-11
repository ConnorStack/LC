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
}
