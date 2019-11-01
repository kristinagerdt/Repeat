package cs.theJourneyBegins;

import org.junit.Test;

import static org.junit.Assert.*;

public class CenturyFromYearTest {

    private int year;

    @Test
    public void test20centuryFromYear() {
        year = 1989;
        int actual = 20;
        int expected = CenturyFromYear.centuryFromYear(year);
        assertEquals(expected, actual);
    }

    @Test
    public void test19centuryFromYear() {
        year = 1889;
        int actual = 19;
        int expected = CenturyFromYear.centuryFromYear(year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1700centuryFromYear() {
        year = 1700;
        int actual = 17;
        int expected = CenturyFromYear.centuryFromYear(year);
        assertEquals(expected, actual);
    }

    @Test
    public void test4centuryFromYear() {
        year = 374;
        int actual = 4;
        int expected = CenturyFromYear.centuryFromYear(year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1centuryFromYear() {
        year = 1;
        int actual = 1;
        int expected = CenturyFromYear.centuryFromYear(year);
        assertEquals(expected, actual);
    }
}