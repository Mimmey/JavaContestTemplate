import Solution.Task0;

import java.util.Scanner;

/**
 * Используем только для финальных решений (для закидывания в контест).
 * Для локальных тестов используем тесты из пакета test.
 */

public class Main {
    /**
     * Для каждой задачи переписываем код main, чтоб
     * передавать разные параметры из разных источников.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(Task0.solve(a, b));
        }
    }
}
