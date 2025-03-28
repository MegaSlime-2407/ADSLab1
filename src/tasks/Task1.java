package tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task1 {
   public static void main(String[] args) {
        System.out.println("Print the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE; // min is defined as max value of integer
        int[] array = new int[n];
       long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) { // using this method we get min element in array time complexity is O(N)
            array[i] = sc.nextInt();
            if(min > array[i]){ // changing min after finding something smaller
                min = array[i];
            }
        }
       long stopTime = System.currentTimeMillis();
       float elapsedTime = stopTime - startTime;
        System.out.println(min);
       System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");

    }
}
