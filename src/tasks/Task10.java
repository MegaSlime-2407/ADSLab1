package tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long StartTime = System.nanoTime();
        int result = gcd(b, a);
        long EndTime = System.nanoTime();
        float elapsedTime = EndTime - StartTime;
        System.out.println(result);
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
    }
    public static int gcd(int a, int b) {
        if(b == 0)
            return a; // checks condition if first number is zero then second one will be our gcd
        return gcd(b, a % b); // we are returning gcd of b and mod a b
    }
}
