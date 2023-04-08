import java.sql.SQLOutput;
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
    static boolean isPrime(int n) {
        int del = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                del++;
            }
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
        boolean running = true;
        while (running) {
            System.out.println("Choose the option please:\n" +
                    "0. exit from program\n" +
                    "1. find minimum from array\n" +
                    "2. find average of array\n" +
                    "3. check is the number prime\n" +
                    "4. find factorial of number\n" +
                    "5. find n-th element of Fibonacci sequence\n" +
                    "6. find 'a power of n'\n" +
                    "7. get reverse of array\n" +
                    "8. check is string contain all digits\n" +
                    "9. find binomial coefficient\n" +
                    "10. find GCD");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("GoodBye :)");
                    running = false;
                    continue;
                case 1:
                    System.out.print("Enter length of array: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums1 = new int[n1];
                    for (int i = 0; i < n1; i++) {
                        nums1[i] = sc.nextInt();
                    }
                    System.out.println("Minimum number from array is " + findMin(n1, nums1) + "\n");
                    continue;
                case 2:
                    System.out.print("Enter length of array: ");
                    int n2 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums2 = new int[n2];
                    for (int i = 0; i < n2; i++) {
                        nums2[i] = sc.nextInt();
                    }
                    System.out.println("Average of array is " + findAvg(n2, nums2) + "\n");
                    continue;
                case 3:
                    System.out.print("Enter the number: ");
                    int n3 = sc.nextInt();
                    if (isPrime(n3)) System.out.println("Prime\n");
                    else System.out.println("Composite\n");
                    continue;
                case 4:
                    System.out.print("Enter the number: ");
                    int n4 = sc.nextInt();
                    System.out.println("Factorial of " + n4 + " is " + findFactorial(n4) + "\n");
                    continue;
                case 5:
                    System.out.print("Enter the number: ");
                    int n5 = sc.nextInt();
                    System.out.println(n5 + "-th element of Fibonacci sequence is " + findFibonacci(n5) + "\n");
                    continue;
                case 6:
                    System.out.print("Enter the number: ");
                    int a6 = sc.nextInt();
                    System.out.print("Enter the power of a number: ");
                    int n6 = sc.nextInt();
                    System.out.println(a6 + " power of " + n6 + " is " + findPower(a6, n6) + "\n");
                    continue;
                case 7:
                    System.out.print("Enter length of array: ");
                    int n7 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums7 = new int[n7];
                    for (int i = 0; i < n7; i++) {
                        nums7[i] = sc.nextInt();
                    }
                    System.out.println("Your reverse array is '" + getReverse(n7, nums7) + "'\n");
                    continue;
                case 8:
                    System.out.print("Enter your string: ");
                    String s8 = sc.nextLine();
                    if (isAllDigit(s8)) System.out.println("Yes");
                    else System.out.println("No");
                    continue;
                case 9:
                    System.out.print("Enter bottom number: ");
                    int n9 = sc.nextInt();
                    System.out.print("Enter top number: ");
                    int k9 = sc.nextInt();
                    System.out.println("Binomial coefficient by your two numbers is " + findBinom(n9, k9) + "\n");
                    continue;
                case 10:
                    System.out.print("Enter first number: ");
                    int a10 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b10 = sc.nextInt();
                    System.out.println("GCD of your two numbers is " + findGCD(a10, b10) + "\n");
                    continue;
                default:
                    System.out.println("Ooops, out of range :(");
            }
        }


    }
}
