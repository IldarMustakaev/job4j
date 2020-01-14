package com.iterator;
import java.util.Iterator;

public class MatrixIterator implements Iterator {
    private int[] values;
    private int index = 0;

    public MatrixIterator(final int[][] values) {
        int length = 0;
        for (int i = 0; i < values.length; i++) {
            length += values[i].length;
        }

        int[] oneDimensionalArray = new int[length];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                oneDimensionalArray[index] = values[i][j];
                index++;
            }
        }

        this.values = oneDimensionalArray;
    }

    public boolean hasNext() {
        return values.length > index;
    }

    public Object next() {
        return values[index++];
    }

}