public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(fibonacci(i));
            System.out.println(fibonacciRecursion(i));
            System.out.println(fibonacciFormula(i));
        }
    }

    private static int fibonacciFormula(int n) {
        double temp = (Math.sqrt(5) + 1) / 2;
        return (int) Math.round(Math.pow(temp, n) / Math.sqrt(5));
    }

    private static int fibonacciRecursion(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

    private static int fibonacci(int n) {
        int[] array = new int[n + 2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}