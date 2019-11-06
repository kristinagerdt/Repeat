package cs.exploringTheWaters;

import java.util.Arrays;

public class AddBorder {
    public static String[] addBorder(String[] picture) {
        String[] result = new String[picture.length + 2];

        char[] chars = new char[picture[0].length() + 2];
        Arrays.fill(chars, '*');
        String asterisks = String.valueOf(chars);

        result[0] = result[result.length - 1] = asterisks;
        for (int i = 0, j = 1; i < picture.length; i++, j++) {
            result[j] = "*" + picture[i] + "*";
        }

        return result;
    }
}