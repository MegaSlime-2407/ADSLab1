import java.util.Scanner;
import tasks.Task1;
import tasks.Task2;
import tasks.Task3;
import tasks.Task4;


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
        }
    }
}