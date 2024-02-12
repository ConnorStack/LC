package me.practice;

import me.practice.Heap.MaxHeap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        MaxHeap maxHeap = new MaxHeap(5);
        maxHeap.clearHeap();
        for (int i = 0; i < maxHeap.getHeapSize(); i++) {
            System.out.println(i);
            maxHeap.add(i);
        }
        System.out.println("\n\n");

        for (int i : maxHeap.getHeap()) {
            System.out.println(i);
        }
        System.out.println("\n\n");
        for (int i = 0; i < maxHeap.getHeapSize(); i++) {
            System.out.println(maxHeap.pop());
        }

        maxHeap.toString();

    }
}
