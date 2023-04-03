import java.util.Scanner;

public class first {
    static int minNum(int n, int[] nums) {
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    static double avg(int n, int[] nums) {
        double total = nums[0];
        for (int i = 1; i < n; i++) {
            total += nums[i];
        }
        return total / n;
    }
    static boolean isPrime(int n) {
        int del = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { del++; }
        }
        return del == 1;
    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static int power(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * power(a, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
}
