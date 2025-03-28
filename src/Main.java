import java.util.Scanner;

import tasks.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of tasks you want to run");
        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        switch (numberOfTasks) {
            case 1:
                Task1 task1 = new Task1();
                task1.main(null);
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.main(null);
                break;
            case 3:
                Task3 task3 = new Task3();
                task3.main(null);
                break;
            case 4:
                Task4 task4 = new Task4();
                task4.main(null);
                break;
            case 5:
                Task5 task5 = new Task5();
                task5.main(null);
                break;
            case 6:
                Task6 task6 = new Task6();
                task6.main(null);
                break;
        }
    }
}