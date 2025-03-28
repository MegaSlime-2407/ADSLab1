package tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long StartTime=System.nanoTime();
        int result = fibonacci(n);
        long EndTime=System.nanoTime();
        float elapsedTime = EndTime-StartTime;
        System.out.println(result);
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
    }
    public static int fibonacci(int n){
        if (n == 0 ){ // returns 0
            return 0;
        }
        else if (n == 1 ){ // returns 1
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2); // using this recursion programm will fall into
    } // until n gonna be 2, after that he will start returning values and time complexity will be O(golden ratio^n)
}
