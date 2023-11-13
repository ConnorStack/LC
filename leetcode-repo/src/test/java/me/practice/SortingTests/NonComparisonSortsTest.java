package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.NonComparisonSorts;

public class NonComparisonSortsTest {
    public int[] expectedArrSize5 = { 0, 1, 2, 3, 4, 5};
    public int[] expectedArrSize10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int[] randCountArray = {0, 0, 4, 2, 4, 5, 2, 1, 0};
    public int[] expectedCountArray = {0, 0, 0, 1, 2, 2, 4, 4, 5};
    public int[] randCountArray2 = { 9, 3, 8, 3, 5, 4, 5, 5, 2};
    public int[] expectedCountArray2 = {2, 3, 3, 4, 5, 5, 5, 8, 9};

    public int[] randRadixArray = {912, 132, 399, 316, 591, 286, 243, 869};
    public int[] expectedRadixArray = {132, 243, 286, 316, 399, 591, 869, 912};

    public int[] randArraySize5 = { 3, 1, 4, 2, 5, 0};
    public int[] randArraySize10 = { 5, 1, 10, 6, 4, 7, 2, 9, 3, 8 };

    public int[] nonIncreasingSize5 = { 5, 4, 3, 2, 1 };
    public int[] nonIncreasingSize10 = {10, 9,8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void testBasicCountSort(){
        assertArrayEquals(expectedArrSize5, NonComparisonSorts.basicCountSort(randArraySize5));
    }

    @Test
    public void testExtendedCountSort(){
        assertArrayEquals(expectedArrSize5, NonComparisonSorts.extendedCountSort(randArraySize5));
    }

    @Test
    public void testRadixSort(){
        assertArrayEquals(expectedRadixArray, NonComparisonSorts.radixSort(randRadixArray));
    }
}
