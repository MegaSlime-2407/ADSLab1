package tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long StartTime = System.nanoTime();
        reversePrint(n, sc);
        long EndTime = System.nanoTime();
        float elapsedTime = EndTime - StartTime;
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
}
private static void reversePrint(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        reversePrint(n - 1, sc); // i call it recusively and then only start printing
        System.out.println(num); // time complexity should be O(n)
    }
}
