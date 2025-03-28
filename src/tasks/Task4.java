package tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long StartTime = System.nanoTime();
        long result = factorial(n);
        long endTime = System. nanoTime();
        float elapsedTime = endTime - StartTime;
        System.out.println(result);
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
    }
    public static int factorial(int n) { // calculates factorial from 1 to n
        return n == 1 ? 1 : n * factorial(n - 1); // if its 1 returns 1 if its not returns n*fact(n-1) till
    } // till its 1, so time complexity will be O(n)
}
