package cs.smoothSailing;

public class CommonCharacterCount {
    public static int commonCharacterCount(String s1, String s2) {
        Character[] alphabet = (s1 + s2)
                .chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .toArray(Character[]::new);

        int countS1 = 0;
        int countS2 = 0;
        int result = 0;

        for (char c : alphabet) {
            for (char c1 : s1.toCharArray()) {
                if (c1 == c) countS1++;
            }
            for (char c2 : s2.toCharArray()) {
                if (c2 == c) countS2++;
            }
            if (countS1 != 0 && countS2 != 0) {
                result += Math.min(countS1, countS2);
            }
            countS1 = 0;
            countS2 = 0;
        }

        return result;
    }

    public static int commonCharacterCount2(String s1, String s2) {
        int[] sa1 = new int[26];
        int[] sa2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int temp = s1.charAt(i) - 'a';
            sa1[temp]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            sa2[s2.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.min(sa1[i], sa2[i]);
        }

        return count;
    }
}