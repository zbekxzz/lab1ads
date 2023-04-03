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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) { System.out.println("Prime"); }
        else { System.out.println("Composite"); }
    }
}
