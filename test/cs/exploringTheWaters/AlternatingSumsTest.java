package cs.exploringTheWaters;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingSumsTest {

    private int[] a;

    @Test
    public void test5ItemsArrayAlternatingSums() {
        a = new int[]{50, 60, 60, 45, 70};
        int[] actual = {180, 105};
        int[] expected = AlternatingSums.alternatingSums(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2ItemsArrayAlternatingSums() {
        a = new int[]{100, 50};
        int[] actual = {100, 50};
        int[] expected = AlternatingSums.alternatingSums(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1ItemArrayAlternatingSums() {
        a = new int[]{100};
        int[] actual = {100, 0};
        int[] expected = AlternatingSums.alternatingSums(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5ItemsArrayAlternatingSumsStream() {
        a = new int[]{50, 60, 60, 45, 70};
        int[] actual = {180, 105};
        int[] expected = AlternatingSums.alternatingSumsStream(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2ItemsArrayAlternatingSumsStream() {
        a = new int[]{100, 50};
        int[] actual = {100, 50};
        int[] expected = AlternatingSums.alternatingSumsStream(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test1ItemArrayAlternatingSumsStream() {
        a = new int[]{100};
        int[] actual = {100, 0};
        int[] expected = AlternatingSums.alternatingSumsStream(a);
        assertArrayEquals(expected, actual);
    }
}