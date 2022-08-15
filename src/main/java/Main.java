import Solution.Task0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(Task0.solve(a, b));
        }
    }
}
