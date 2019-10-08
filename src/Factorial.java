public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(factorial(i));
            System.out.println(factorialRecursion(i));
        }
    }

    private static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}