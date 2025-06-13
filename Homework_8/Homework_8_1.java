package Homework_8;

import java.util.Scanner;

public class Homework_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String shortest = str1;
        String longest = str1;
        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }
        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Ее длина: " + shortest.length());
        System.out.println("Самая длинная строка: " + longest);
        System.out.println("Ее длина: " + longest.length());
        scanner.close();
    }
}
