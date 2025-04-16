package Homework_2;

import java.util.Scanner;

public class Homework_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a > 0) {
                int s = 0;
                int b = 0;
                for (s = 0; b < a + 1; b = b + 1) {
                    s = s + b;
                }
                System.out.println(s);
            } else {
                System.out.println("Введите корректные данные");
            }
        } else {
            System.out.println("Введите корректные данные");
        }
    }
}
