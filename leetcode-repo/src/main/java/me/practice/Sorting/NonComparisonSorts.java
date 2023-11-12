package me.practice.Sorting;

public class NonComparisonSorts {
    
    public static int[] basicCountSort(int[] arr){
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortedArr[arr[i]] = arr[i];
        }
        return sortedArr;
    }
}
