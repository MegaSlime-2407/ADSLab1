package tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
        long StartTime = System.nanoTime();
        System.out.println(bc(n, k));
        long EndTime = System.nanoTime();
        float elapsedTime = EndTime - StartTime;
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
        }

        static int bc(int n, int k) {
            if (k == 0 || k == n) { // checks if k = 0 and k=n and returns 0 cause in bc by formula it gives 1
                return 1;
            }
            return bc(n - 1, k - 1) + bc(n - 1, k); // returns bc, time complexity is o(n)
        }
    }

