package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.ComparisonSorts;

public class ComparisonSortsTest {
    public int[] expectedArrSize5 = { 1, 2, 3, 4, 5 };
    public int[] randScrambleSize5 = { 3, 1, 4, 2, 5 };
    public int[] nonIncreadingSize5 = { 5, 4, 3, 2, 1 };

    @Test
    public void testBubbleSortWithRandomInput() {
        int[] arr = ComparisonSorts.bubbleSort(randScrambleSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testBubbleSortWithNonIncreasingInput() {
        int[] arr = ComparisonSorts.bubbleSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testSelectSortWithRandomInput() {
        int [] arr = ComparisonSorts.selectSort(randScrambleSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

        @Test
    public void testSelectSortIncreasingInput() {
        int [] arr = ComparisonSorts.selectSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

    @Test
    public void testInsertionSortWithRandomInput() {
        int[] arr = ComparisonSorts.insertionSort(randScrambleSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }

        @Test
    public void testInsertionSortWithNonIncreasingInput() {
        int[] arr = ComparisonSorts.insertionSort(nonIncreadingSize5);
        assertArrayEquals(expectedArrSize5, arr);
    }
}
