package islandOfKnowledge;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class BoxBlurTest {

    private int[][] image;

    @Test
    public void test3x3BoxBlur() {
        image = new int[][]{
                {1, 1, 1},
                {1, 7, 1},
                {1, 1, 1}};
        int[][] actual = new int[][]{{1}};
        int[][] expected = BoxBlur.boxBlur(image);
        assertEquals(convertToString(actual), convertToString(expected));
    }

    @Test
    public void test3x4BoxBlur() {
        image = new int[][]{
                {36, 0, 18, 9},
                {27, 54, 9, 0},
                {81, 63, 72, 45}};
        int[][] actual = new int[][]{{40, 30}};
        int[][] expected = BoxBlur.boxBlur(image);
        assertEquals(convertToString(actual), convertToString(expected));
    }

    @Test
    public void test4x4BoxBlur() {
        image = new int[][]{
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}};
        int[][] actual = new int[][]{{5, 4}, {4, 4}};
        int[][] expected = BoxBlur.boxBlur(image);
        assertEquals(convertToString(actual), convertToString(expected));
    }

    @Test
    public void test7x7BoxBlur() {
        image = new int[][]{
                {36, 0, 18, 9, 9, 45, 27},
                {27, 0, 54, 9, 0, 63, 90},
                {81, 63, 72, 45, 18, 27, 0},
                {0, 0, 9, 81, 27, 18, 45},
                {45, 45, 27, 27, 90, 81, 72},
                {45, 18, 9, 0, 9, 18, 45},
                {27, 81, 36, 63, 63, 72, 81}};
        int[][] actual = new int[][]{
                {39, 30, 26, 25, 31},
                {34, 37, 35, 32, 32},
                {38, 41, 44, 46, 42},
                {22, 24, 31, 39, 45},
                {37, 34, 36, 47, 59}};
        int[][] expected = BoxBlur.boxBlur(image);
        assertEquals(convertToString(actual), convertToString(expected));
    }

    private String convertToString(int[][] array) {
        return Arrays
                .stream(array)
                .map(Arrays::toString)
                .collect(Collectors.joining());
    }
}