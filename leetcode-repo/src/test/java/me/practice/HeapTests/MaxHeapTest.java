package me.practice.HeapTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.practice.Heap.MaxHeap;

import me.practice.Sorting.ComparisonSorts;

public class MaxHeapTest {
    MaxHeap maxHeap = new MaxHeap(5);

    int[] expectedArrSize5 = { -1, 0, 0, 0, 0, 0 };

    @Test
    public void testEmptyMaxHeap() {
        maxHeap.clearHeap();
        assertArrayEquals(expectedArrSize5, maxHeap.getHeap());
    }

    @Test
    public void testMaxHeapAddOnce() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        int[] expected = { -1, 5, 0, 0, 0, 0 };

        assertArrayEquals(expected, maxHeap.getHeap());
    }

    @Test
    public void testMaxHeapAddToFill() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(1);
        int[] expected = { -1, 5, 4, 3, 2, 1 };

        assertArrayEquals(expected, maxHeap.getHeap());
    }

    @Test
    public void testMaxHeapAddOverflow() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(1);
        maxHeap.add(10);
        int[] expected = { -1, 5, 4, 3, 2, 1 };

        assertArrayEquals(expected, maxHeap.getHeap());
    }

    @Test
    public void testMaxHeapPopOnEmpty() {
        maxHeap.clearHeap();
        int expectedPop = -1;
        int actualPop = maxHeap.pop();
        assertEquals(expectedPop, actualPop);

    }

    @Test
    public void testMaxHeapPeekOnEmpty() {
        maxHeap.clearHeap();
        int expectedPeekValue = 0;
        int actualPeekValue = maxHeap.peek();

        assertEquals(expectedPeekValue, actualPeekValue);
    }

    @Test
    public void testMaxHeapPeekOnOneValue() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        int expectedPeekValue = 5;
        int actualPeekValue = maxHeap.peek();

        assertEquals(expectedPeekValue, actualPeekValue);
    }

    @Test
    public void testMaxHeapPeekOnFull() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(1);
        int expectedPeekValue = 5;
        int actualPeekValue = maxHeap.peek();

        assertEquals(expectedPeekValue, actualPeekValue);
    }

    @Test
    public void testMaxHeapPeekOverflow() {
        maxHeap.clearHeap();
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(1);
        maxHeap.add(10);
        int expectedPeekValue = 1;
        int actualPeekValue = maxHeap.peek();

        assertEquals(expectedPeekValue, actualPeekValue);
    }

}
