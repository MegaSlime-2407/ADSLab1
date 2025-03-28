package tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long StartTime = System.nanoTime();
        System.out.println(allDigits(s,0) ? "Yes": "No");
        long EndTime = System.nanoTime();
        float elapsedTime = EndTime - StartTime;
        System.out.println("Duration: " + elapsedTime/1000000 + " milliseconds");
    }

    static public boolean allDigits(String s, int index) {
        if (s.length() == index) { // if index reached length so it means all digits
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) { // checks if char is digit time complexity of this method is 0(1)
            return false; // but time complexity of whole part is O(n) cause it runs through whole string
        }
        return allDigits(s, index + 1); // recursion
    }
}