package tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        long StartTime = System.nanoTime();
        int result = power(a,n);
        long EndTime = System.nanoTime();
        float elapsedTime = EndTime - StartTime;
        System.out.println(result);
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");

    }
    public static int power(int a, int n) {
        if(n == 1) // if power is 1 just return a
            return a;
        return a* power(a, n-1); // returning a*power(a,n-1) till n=1, time complexity is o(n)
    }
}
