package smoothSailing;

public class ReverseInParentheses {
    public static String reverseInParentheses(String inputString) {
        StringBuilder result = new StringBuilder(inputString);
        int openIndex, closedIndex;
        while (result.indexOf("(") != -1) {
            openIndex = result.lastIndexOf("(");
            closedIndex = result.indexOf(")", openIndex);
            StringBuilder reversedPart = new StringBuilder(result.substring(openIndex + 1, closedIndex)).reverse();
            result.replace(openIndex, closedIndex + 1, reversedPart.toString());
        }
        return result.toString();
    }
}