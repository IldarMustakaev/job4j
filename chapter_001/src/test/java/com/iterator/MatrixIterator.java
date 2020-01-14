package com.iterator;
import java.util.Iterator;

public class MatrixIterator implements Iterator {
    private int[][] values;
    private int i = 0;
    private int j = 0;

    public MatrixIterator(final int[][] values) {
        this.values = values;
    }

    public boolean hasNext() {
        int i = this.i;
        int j = this.j;
        if (values.length > i && values[i].length > j) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        int v = values[i][j];
        increment();
        return v;
    }

    private void increment() {
        if (values.length > i && values[i].length > j + 1) {
            this.j++;
            return;
        }

        if (values.length > i && values[i].length == j + 1) {
            j = 0;
            i++;
            return;
        }

        if (values.length == i + 1) {
            return;
        }
    }

}