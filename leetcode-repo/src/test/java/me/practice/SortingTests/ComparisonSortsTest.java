package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.ComparisonSorts;

public class ComparisonSortsTest {
    public int[] expectedArrSize5 = { 1, 2, 3, 4, 5 };
    public int[] expectedArrSize10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public int[] randArraySize5 = { 3, 1, 4, 2, 5 };
    public int[] randArraySize10 = { 5, 1, 10, 6, 4, 7, 2, 9, 3, 8 };

    public int[] nonIncreasingSize5 = { 5, 4, 3, 2, 1 };
    public int[] nonIncreasingSize10 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    @Test
    public void testBubbleSortWithRandomInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.bubbleSort(randArraySize5));
    }

    @Test
    public void testBubbleSortWithNonIncreasingInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.bubbleSort(nonIncreasingSize5));
    }

    @Test
    public void testSelectSortWithRandomInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.selectSort(randArraySize5));
    }

    @Test
    public void testSelectSortIncreasingInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.selectSort(nonIncreasingSize5));
    }

    @Test
    public void testInsertionSortWithRandomInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.insertionSort(randArraySize5));
    }

    @Test
    public void testInsertionSortWithNonIncreasingInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.insertionSort(nonIncreasingSize5));
    }

    @Test
    public void testHeapSortWithRandomInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.heapSort(randArraySize5));
    }

    @Test
    public void testHeapSortWithNonIncreasingInput() {
        assertArrayEquals(expectedArrSize5, ComparisonSorts.heapSort(nonIncreasingSize5));
    }
}
