package theJourneyBegins;

public class CenturyFromYear {
    public static int centuryFromYear(int year) {
        int n100 = year / 100;
        int n10 = year % 100;
        if (n10 > 0) {
            return n100 + 1;
        }
        return n100;
    }
}