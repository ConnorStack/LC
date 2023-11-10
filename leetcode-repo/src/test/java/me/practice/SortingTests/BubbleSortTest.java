package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.BubbleSort;

public class BubbleSortTest {
    @Test
    public void testSort(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {2, 4, 3, 1, 5};
        int[] expectedArr = {1, 2, 3, 4, 5};
        arr = bubbleSort.sort(arr);

        assertArrayEquals(expectedArr, arr);
    }
}
