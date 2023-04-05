import java.util.Scanner;

public class first {
    /**
     * findMin - function that help you find a minimum number from given array
     *
     * @param n - length of given array
     * @param nums - array to work with them
     * @return - returns minimum number of array
     */
    static int findMin(int n, int[] nums) {
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    /**
     * findAvg - function sum up all numbers and dividing by the number of numbers
     *
     * @param n - length of given array
     * @param nums - array to work with them
     * @return - returns average of array
     */
    static double findAvg(int n, int[] nums) {
        double total = nums[0];
        for (int i = 1; i < n; i++) {
            total += nums[i];
        }
        return total / n;
    }

    /**
     * isDigitPrime - function checking is the given number prime or composite
     *
     * @param n - number to check
     * @return - returns true if number prime, false otherwise
     */
    static boolean isDigitPrime(int n) {
        int del = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { del++; }
        }
        return del == 1;
    }

    /**
     * findFactorial - function that find factorial of given number
     *
     * @param n - number to find factorial
     * @return - return factorial of number
     */
    static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFactorial(n-1);
        }
    }

    /**
     * findFibonacci - function find fibonacci number
     *
     * @param n - fibonacci number to find
     * @return - returns founded fibonacci number
     */
    static int findFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }

    /**
     * findPower - function that return result of power of two given numbers
     *
     * @param a - number
     * @param n - power of number
     * @return - returns a power of n
     */
    static int findPower(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPower(a, n-1);
        }
    }

    /**
     * getReverse - function return string that copying given array but in reverse order
     *
     * @param n - length of given array
     * @param nums - array to reverse
     * @return - reverse string
     */
    static String getReverse(int n, int[] nums) {
        if (n == 1) {
            return Integer.toString(nums[0]);
        }
        else {
            return Integer.toString(nums[n-1]) + " " + getReverse(n-1, nums);
        }
    }

    /**
     * isAllDigit - function that check is all string contain digits
     *
     * @param line - given string to check
     * @return - returns true if string contain all digits, false otherwise
     */
    static boolean isAllDigit(String line) {
        if (line.length() == 1) {
            return Character.isDigit(line.charAt(0));
        }
        else {
            return Character.isDigit(line.charAt(0)) && isAllDigit(line.substring(1));
        }
    }

    /**
     * findBinom - function returns binomial coefficient by two number
     *
     * @param n - first bottom argument
     * @param k - second top argument
     * @return - returns binomial coefficient of two numbers
     */
    static int findBinom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return findBinom(n-1, k-1) + findBinom(n-1, k);
        }
    }

    /**
     * findGCD - function find the greatest common divisor of two numbers
     *
     * @param a - first number
     * @param b - second number
     * @return - returns gcd of two numbers
     */
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return findGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }
}
