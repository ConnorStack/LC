package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.ComparisonSorts;

public class ComparisonSortsTest {
    @Test
    public void testBubbleSort(){
        int[] arr = {3, 1, 4, 2, 5};
        arr = ComparisonSorts.bubbleSort(arr);

        int[] expectedArr = {1, 2, 3, 4, 5};

        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void testSelectSort(){
        int[] arr = {3, 1, 4, 2, 5};
        arr = ComparisonSorts.selectSort(arr);

        int[] expectedArr = {1, 2, 3, 4, 5};

        assertArrayEquals(expectedArr, arr);
    }
}
