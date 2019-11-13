package cs.exploringTheWaters;

import java.util.Arrays;

public class PalindromeRearranging {
    public static boolean palindromeRearranging(String inputString) {
        int[] alphabet = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            alphabet[inputString.charAt(i) - 'a']++;
        }
        long count = Arrays
                .stream(alphabet)
                .filter(i -> i % 2 != 0)
                .count();

        return count <= 1;
    }

    public static boolean palindromeRearrangingStream(String inputString) {
        int count = 0;
        Character[] alphabet = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .toArray(Character[]::new);
        for (int i = 0; i < alphabet.length; i++) {
            int index = i;
            long charCounter = inputString
                    .chars()
                    .filter(c -> c == alphabet[index])
                    .count();
            count += charCounter % 2;
        }
        return count <= 1;
    }
}