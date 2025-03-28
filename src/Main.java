import java.util.Scanner;
import tasks.Task1;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of tasks you want to run");
        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        switch (numberOfTasks) {
            case 1:
                Task1 task1 = new Task1();
                task1.main(null);
        }
    }
}