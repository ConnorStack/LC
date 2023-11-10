package me.practice.SortingTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.practice.Sorting.SelectSort;

public class SelectSortTest {

    @Test
    public void testSort() {
        int[] arr = {2, 3, 5, 1, 4};

        arr = SelectSort.sort(arr);

        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, arr);
    }
    
}
