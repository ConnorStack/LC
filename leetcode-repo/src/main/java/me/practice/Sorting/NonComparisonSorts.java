package me.practice.Sorting;

import java.util.Arrays;

public class NonComparisonSorts {
    
    public static int[] basicCountSort(int[] arr){
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortedArr[arr[i]] = arr[i];
        }
        return sortedArr;
    }

    public static int[] extendedCountSort(int[] arr){
        int K = Arrays.stream(arr).max().getAsInt();
        int[] counts = new int[K + 1];
        for (int elem : arr) {
            counts[elem] += 1;
        }
        // we now overwrite our original counts with the starting index
        // of each element in the final sorted array
        int startingIndex = 0;
        for (int i = 0; i < K + 1; i++) {
            int count = counts[i];
            counts[i] = startingIndex;
            startingIndex += count;
        }

        int sortedArray[] = new int[arr.length];
        for (int elem : arr) {
            sortedArray[counts[elem]] = elem;
            // since we have placed an item in index counts[elem], we need to
            // increment counts[elem] index by 1 so the next duplicate element
            // is placed in appropriate index
            counts[elem] += 1;
        }

        // common practice to copy over sorted list into original arr
        // it's fine to just return the sortedArray at this point as well
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArray[i];
        }
        return arr;
    }

    public static int[] countSortPractice(int[] arr)
    {
        int[] sortedArr = new int[arr.length];
        int k = Arrays.stream(arr).max().getAsInt();

        int[] counts = new int[k + 1];
        int[] startingIndex = new int[k + 1];

        for(int element : arr){
            counts[element]+= 1;
        }

        // int accum = 0;
        // for (int i = 0; i < counts.length; i++) {
        //     accum += counts[i];
        //     startingIndex[i] = accum;
        // }

        int accum = 0;
        for(int i = 0; i < counts.length; i++){
            startingIndex[i] = accum;
            accum += counts[i];
        }

        // for (int i = 0; i < startingIndex.length - 1; i++) {
        //     // int temp = startingIndex[i];
        //     startingIndex[i] = startingIndex[i+1];
        //     // startingIndex[i+1] = temp;
        // }

        // for (int i = startingIndex.length - 1; i > 0; i--) {
        //     startingIndex[i] = startingIndex[i-1];
        // }

        // startingIndex[0]=0;

        for (int i = 0; i < sortedArr.length; i++) {
            //{0, 0, 4, 2, 4, 5, 2, 1, 0};
            int pulledValue = arr[i];
            int element = startingIndex[pulledValue];
            startingIndex[pulledValue]++;
            sortedArr[element] = pulledValue;
        }


        return sortedArr;
    }
}
