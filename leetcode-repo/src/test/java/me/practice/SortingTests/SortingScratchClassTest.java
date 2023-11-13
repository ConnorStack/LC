package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.SortingScratchClass;

public class SortingScratchClassTest {
    public int[] expectedArrSize5 = { 1, 2, 3, 4, 5};
    public int[] expectedArrSize10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int[] randCountArrayRandomVariation = {0, 0, 4, 2, 4, 5, 2, 1, 0};
    public int[] randCountArrayNoZeroVariation = { 9, 3, 8, 3, 5, 4, 5, 5, 2};    
    public int[] expectedCountArrayRandomVariaton = {0, 0, 0, 1, 2, 2, 4, 4, 5};
    public int[] expectedCountArrayNoZeroVariation = {2, 3, 3, 4, 5, 5, 5, 8, 9};

    public int[] randArraySize5 = { 3, 1, 4, 2, 5 };
    public int[] randArraySize10 = { 5, 1, 10, 6, 4, 7, 2, 9, 3, 8 };

    public int[] nonIncreasingSize5 = { 5, 4, 3, 2, 1 };
    public int[] nonIncreasingSize10 = {10, 9,8, 7, 6, 5, 4, 3, 2, 1};
    
    @Test
    public void testInsertionSortPracWithSize10Input(){
        assertArrayEquals(expectedArrSize10, SortingScratchClass.insertionSortPrac(randArraySize10));
    }

    @Test
    public void testInsertionSortPracWithSize5Input(){
        assertArrayEquals(expectedArrSize5, SortingScratchClass.insertionSortPrac(expectedArrSize5));
    }

    @Test
    public void testHeapSortPrac(){
        assertArrayEquals(expectedArrSize10, SortingScratchClass.heapSortPrac(randArraySize10));
    }

    @Test
    public void testCountSortPrac(){
        assertArrayEquals(expectedCountArrayRandomVariaton, SortingScratchClass.countSortPrac(randCountArrayRandomVariation));
    }

    @Test
    public void testCountSortPracWithNoZeroVariation(){
        assertArrayEquals(expectedCountArrayNoZeroVariation, SortingScratchClass.countSortPrac(randCountArrayNoZeroVariation));
    }
}
