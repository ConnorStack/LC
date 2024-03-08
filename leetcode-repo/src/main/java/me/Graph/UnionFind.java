package me.Graph;

public class UnionFind {
    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
    }

}
