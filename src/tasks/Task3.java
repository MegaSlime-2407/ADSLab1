package tasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long startTime = System.nanoTime();
        String result = prime(n);
    long stopTime = System.nanoTime();
    float elapsedTime = stopTime - startTime;
    System.out.println(result);
    System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
    }

    public static String prime(int n) {
        if (n<2) { // all number less than 2 is prime
            return("Not prime");
        }
        for(int i=2;i<sqrt(n);i++) { // time complexity will be O(sqrt(n) cause im checking only sqrt of n
            if(n%i==0) {
                return("Not prime");
            }
        } // if its non prime i will return prime always
        return("Prime");
    }
}
