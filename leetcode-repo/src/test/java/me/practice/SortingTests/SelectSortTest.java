package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.SelectSort;

public class SelectSortTest {
    @Test
    public void testAdd() {
        SelectSort selectSort = new SelectSort();
        int result = selectSort.add(5, 2);

        assertEquals(7, result);
    }

    @Test
    public void testSort() {
        SelectSort selectSort = new SelectSort();
        int[] arr = {2, 3, 5, 1, 4};
        arr = selectSort.sort(arr);

        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, arr);
    }
    
}
