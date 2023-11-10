package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.ComparisonSorts;

public class ComparisonSortsTest {
    public int[] expectedArrSize5 = {1, 2, 3, 4, 5};
    public int[] randScrambleSize5 = {3, 1, 4, 2, 5};
    public int[] nonIncreadingSize5 = {5, 4, 3, 2, 1};


    @Test
    public void testBubbleSortWithRandomInput(){
        int[] arr = ComparisonSorts.bubbleSort(randScrambleSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

        @Test
    public void testBubbleSortWithNonIncreadingInput(){
        int[] arr = ComparisonSorts.bubbleSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testSelectSort(){
        int[] arr = {3, 1, 4, 2, 5};
        arr = ComparisonSorts.selectSort(arr);

        int[] expectedArr = {1, 2, 3, 4, 5};

        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testInsertionSort(){
        int[] arr = {3, 1, 4, 2, 5};
    }
}
