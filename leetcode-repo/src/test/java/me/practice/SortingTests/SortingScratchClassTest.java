package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.SortingScratchClass;

public class SortingScratchClassTest {
    public int[] expectedArrSize5 = { 1, 2, 3, 4, 5};
    public int[] expectedArrSize10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int[] randArraySize5 = { 3, 1, 4, 2, 5 };
    public int[] randArraySize10 = { 5, 1, 10, 6, 4, 7, 2, 9, 3, 8 };

    public int[] nonIncreadingSize5 = { 5, 4, 3, 2, 1 };
    public int[] nonIncreasingSize10 = {10, 9,8, 7, 6, 5, 4, 3, 2, 1};
    @Test
    public void testHeapSortPrac(){
        int arr[] = SortingScratchClass.heapSortPrac(randArraySize10);
        assertArrayEquals(expectedArrSize10, arr);
    }
}
