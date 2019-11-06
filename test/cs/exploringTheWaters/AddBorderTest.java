package cs.exploringTheWaters;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddBorderTest {

    private String[] picture;

    @Test
    public void testOneStringAddBorder() {
        picture = new String[]{"abc"};
        String[] actual = new String[]{
                "*****",
                "*abc*",
                "*****"};
        String[] expected = AddBorder.addBorder(picture);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoStringsAddBorder() {
        picture = new String[]{
                "abc",
                "ded"};
        String[] actual = new String[]{
                "*****",
                "*abc*",
                "*ded*",
                "*****"};
        String[] expected = AddBorder.addBorder(picture);
        assertEquals(expected, actual);
    }

    @Test
    public void testThreeStringsAddBorder() {
        picture = new String[]{
                "abc",
                "ded",
                "eee"};
        String[] actual = new String[]{
                "*****",
                "*abc*",
                "*ded*",
                "*eee*",
                "*****"};
        String[] expected = AddBorder.addBorder(picture);
        assertEquals(expected, actual);
    }

    @Test
    public void testOneAsteriskAddBorder() {
        picture = new String[]{"*"};
        String[] actual = new String[]{
                "***",
                "***",
                "***"};
        String[] expected = AddBorder.addBorder(picture);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyStringAddBorder() {
        picture = new String[]{""};
        String[] actual = new String[]{
                "**",
                "**",
                "**"};
        String[] expected = AddBorder.addBorder(picture);
        assertEquals(expected, actual);
    }
}