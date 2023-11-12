package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.ComparisonSorts;

public class ComparisonSortsTest {
    public int[] expectedArrSize5 = { 1, 2, 3, 4, 5};
    public int[] expectedArrSize10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int[] randArraySize5 = { 3, 1, 4, 2, 5 };
    public int[] randArraySize10 = { 5, 1, 10, 6, 4, 7, 2, 9, 3, 8 };

    public int[] nonIncreasingSize5 = { 5, 4, 3, 2, 1 };
    public int[] nonIncreasingSize10 = {10, 9,8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void testBubbleSortWithRandomInput() {
        int[] arr = ComparisonSorts.bubbleSort(randArraySize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testBubbleSortWithNonIncreasingInput() {
        int[] arr = ComparisonSorts.bubbleSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testSelectSortWithRandomInput() {
        int [] arr = ComparisonSorts.selectSort(randArraySize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

        @Test
    public void testSelectSortIncreasingInput() {
        int [] arr = ComparisonSorts.selectSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testInsertionSortWithRandomInput() {
        int[] arr = ComparisonSorts.insertionSort(randArraySize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

        @Test
    public void testInsertionSortWithNonIncreasingInput() {
        int[] arr = ComparisonSorts.insertionSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testHeapSortWithRandomInput() {
        int[] arr = ComparisonSorts.heapSort(randArraySize5);
        assertArrayEquals(expectedArrSize5, arr);
    }
    @Test
    public void testHeapSortWithNonIncreasingInput()
    {
        int[] arr = ComparisonSorts.heapSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }
}
