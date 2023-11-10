package me.practice.SortingTests;

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
    
}
