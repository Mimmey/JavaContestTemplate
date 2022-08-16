import solution.Task0;

import java.util.Scanner;

/**
 * Use it for final solutions and publishing to contests.
 * For local test use "test" package and "solution" packages.
 */
public class Main {
    /**
     * Rewrite this method if you are sure that all tests was passing.
     * Read all vars you need and send it to the "solve" method of task you are working on.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(Task0.solve(a, b));
        }
    }
}

/**
 * After finishing the task you need to duplicate the code of task class
 * without word "public" here to make your solution locate only in
 * Main.java file.
 */
//class Task0 {
//    public static int solve(int a, int b) {
//        return a + b;
//    }
//}
