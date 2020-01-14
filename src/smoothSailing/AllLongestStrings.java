package smoothSailing;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
    public static String[] allLongestStrings(String[] inputArray) {
        int maxLen = 0;
        for (String item : inputArray) {
            if (item.length() > maxLen) {
                maxLen = item.length();
            }
        }

        List<String> result = new ArrayList<>();
        for (String s : inputArray) {
            if (s.length() == maxLen) {
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
}