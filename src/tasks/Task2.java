package tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Print the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0; // sum of total numbers in array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) { // time complexity is O(N), cause we going through array one time
            array[i] = sc.nextInt();
            sum += array[i]; // adding array[i] to sum
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(sum/5);
        System.out.println("Duration:" + elapsedTime/1000000 + "milliseconds");

    }
}
