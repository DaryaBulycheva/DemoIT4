package Homework_8;

import java.util.Scanner;

public class Homework_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String shortest, middle, longest;
        if (str1.length() <= str2.length() && str1.length() <= str3.length()) {
            shortest = str1;
            if (str2.length() <= str3.length()) {
                middle = str2;
                longest = str3;
            } else {
                middle = str3;
                longest = str2;
            }
        } else if (str2.length() <= str1.length() && str2.length() <= str3.length()) {
            shortest = str2;
            if (str1.length() <= str3.length()) {
                middle = str1;
                longest = str3;
            } else {
                middle = str3;
                longest = str1;
            }
        } else {
            shortest = str3;
            if (str1.length() <= str2.length()) {
                middle = str1;
                longest = str2;
            } else {
                middle = str2;
                longest = str1;
            }
        }
        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Ее длина: " + shortest.length());
        System.out.println("Средняя по длине строка: " + middle);
        System.out.println("Ее длина: " + middle.length());
        System.out.println("Самая длинная строка: " + longest);
        System.out.println("Ее длина: " + longest.length());
        scanner.close();
    }
}
