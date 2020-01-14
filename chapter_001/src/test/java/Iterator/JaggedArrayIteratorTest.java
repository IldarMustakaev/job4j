package com.iterator;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JaggedArrayIteratorTest {

    private Iterator<Integer> it;
    private Iterator<Integer> it2;

    @Before
    public void setUp() {
        it = new MatrixIterator(new int[][]{{1}, {3, 4}, {7} });
        it2 = new MatrixIterator(new int[][]{{1},{2, 3, 4, 5,},{6, 7}, {8, 9, 10, 11, 12, 13, 14}});

    }

    @Test
    public void testsThatNextMethodDoesntDependsOnPriorHasNextInvocation() {
        assertThat(it.next(), is(1));
        assertThat(it.next(), is(3));
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(7));
    }

    @Test
    public void testsIldar() {
        assertThat(it2.next(), is(1));
        assertThat(it2.next(), is(2));
        assertThat(it2.next(), is(3));
        assertThat(it2.next(), is(4));
        assertThat(it2.next(), is(5));
        assertThat(it2.next(), is(6));
    }

    @Test
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.next(), is(3));
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(7));
    }

    @Test
    public void hasNextNextSequentialInvocation() {
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(3));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(4));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(7));
        assertThat(it.hasNext(), is(false));
    }
}
