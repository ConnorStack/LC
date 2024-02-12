package me.practice.Heap;

public class MaxHeap {
    private int[] maxHeap;
    int heapSize;
    int realSize = 0;

    // Building a heap that is 1 - indexed.
    public MaxHeap(int heapSize) {
        this.heapSize = heapSize;
        maxHeap = new int[heapSize + 1];
        maxHeap[0] = -1;
        for (int i = 1; i < maxHeap.length; i++) {
            maxHeap[i] = 0;
        }
    }

    public void add(int element) {
        // We know for a max heap that when an item is added, we add it
        // to the last element, then we need to check that our
        // max heap still satisfies the definition of a maxheap
        realSize++;
        if (realSize > heapSize) {
            System.out.println("too many elements");
            realSize--;
            return;
        }
        maxHeap[realSize] = element;
        int index = realSize;
        int parent = index / 2;
        // The index is the position of the last added element
        // If it is greater than the parent this breaks max heap rule
        // If index is 1, then there is only the 0th index
        // which is our dud value, and the root node. So dont loop
        while (index > 1 && maxHeap[index] > maxHeap[parent]) {
            int temp = maxHeap[parent];
            maxHeap[parent] = maxHeap[index];
            maxHeap[index] = temp;
            index = parent; // REVIEW THIS POINT. IT WAS MISSED
            parent = index / 2;
        }
    }

    public int peek() {
        return maxHeap[1];
    }

    private void swap(int[] maxHeap, int i, int j) {
        int temp = maxHeap[i];
        maxHeap[i] = maxHeap[j];
        maxHeap[j] = temp;
    }

    public int pop() {
        if (realSize < 1) {
            System.out.println("No elements to pop");
            return -1;
        } else {
            // there is at least one value in the heap. We want to remove the root.
            // Then replace it with the last node. Then swap parent-child nodes until
            // maxheap definition is satisfied
            int poppedElement = maxHeap[1];
            maxHeap[1] = maxHeap[realSize];
            realSize--;
            int index = 1;
            while (index <= realSize / 2) {
                int left = index * 2;
                int right = index * 2 + 1;
                // if the left or right child of the parent has a larger value
                // than the parent, then the two values need to be swapped.
                // We also need to determine which of the children is larger
                if (maxHeap[left] > maxHeap[index] || maxHeap[right] > maxHeap[index]) {
                    if (maxHeap[left] > maxHeap[right]) {
                        swap(maxHeap, index, left);
                    } else {
                        swap(maxHeap, index, right);
                    }
                } else {
                    break;
                }
            }
            return poppedElement;
        }
    }

    public int getHeapRealSize() {
        return realSize;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public String toString() {
        if (realSize == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSize; i++) {
                sb.append(maxHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }

    public int[] getHeap() {
        return this.maxHeap;
    }

    public void clearHeap() {
        for (int i = 1; i < maxHeap.length; i++) {
            maxHeap[i] = 0;
        }
    }
}
