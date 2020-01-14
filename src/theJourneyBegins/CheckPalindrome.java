package theJourneyBegins;

public class CheckPalindrome {
    public static boolean checkPalindrome(String inputString) {
        int size = inputString.length();
        int count = 0;
        for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
            if (inputString.charAt(i) == inputString.charAt(j)) {
                count++;
            }
        }
        return count == size / 2;
    }
}