package cs.islandOfKnowledge;

import java.util.Arrays;

public class IsIPv4Address {
    public static boolean isIPv4Address(String inputString) {
        String[] words = inputString.split("\\."); //"[.]"
        if (words.length != 4) return false;

        for (String item : words) {
            if (item.isEmpty()) return false;
            if (!item.matches("[0-9]{1,3}")) return false; //"[0-9]+" "\\d+"
            if (Integer.parseInt(item) < 0 || Integer.parseInt(item) > 255) return false;
        }

        return true;
    }

    public static boolean isIPv4AddressStream(String inputString) {
        String[] words = inputString.split("\\."); //"[.]"
        int[] ints = new int[words.length];

        for (int i = 0; i < ints.length; i++) {
            try {
                ints[i] = Integer.parseInt(words[i]);
            } catch (NumberFormatException e) {
                ints[i] = -1;
            }
        }

        long count = Arrays
                .stream(ints)
                .filter(i -> i >= 0 && i <= 255)
                .count();

        return count == 4 && words.length == 4;
    }
}