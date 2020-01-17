package com.iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] values;
    private int index = 0;

    public EvenNumbersIterator(int[] values) {
        this.values = values;
        index = hasEvenFromIndex(index);
    }

    public boolean hasNext() {
        return index != -1;
    }

    public Object next() {
        if (index == -1) {
            throw new NoSuchElementException();
        }

        if (values.length > index) {
            int index = this.index;
            this.index = hasEvenFromIndex(index + 1);
            return values[index];
        } else {
            index = -1;
            throw new NoSuchElementException();
        }
    }

    private int hasEvenFromIndex(int index) {
        for (int i = index; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
