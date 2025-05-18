package Homework_8;

import java.util.Scanner;

public class Homework_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result += currentChar;
            result += currentChar;
        }
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
