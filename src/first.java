import java.util.Scanner;

public class first {
    static int findMin(int n, int[] nums) {
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    static double findAvg(int n, int[] nums) {
        double total = nums[0];
        for (int i = 1; i < n; i++) {
            total += nums[i];
        }
        return total / n;
    }
    static boolean isDigitPrime(int n) {
        int del = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { del++; }
        }
        return del == 1;
    }
    static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFactorial(n-1);
        }
    }
    static int findFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
    static int findPower(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPower(a, n-1);
        }
    }
    static String getReverse(int n, int[] nums) {
        if (n == 1) {
            return Integer.toString(nums[0]);
        }
        else {
            return Integer.toString(nums[n-1]) + " " + getReverse(n-1, nums);
        }
    }
    static boolean isAllDigit(String line) {
        if (line.length() == 1) {
            return Character.isDigit(line.charAt(0));
        }
        else {
            return Character.isDigit(line.charAt(0)) && isAllDigit(line.substring(1));
        }
    }
    static int findBinom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return findBinom(n-1, k-1) + findBinom(n-1, k);
        }
    }
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
