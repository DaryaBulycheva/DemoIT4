package Homework_8;

import java.util.Scanner;

public class Homework_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        int average = (len1 + len2 + len3) / 3;
        System.out.println("Строки, длина которых меньше средней:");
        if (len1 < average) {
            System.out.println("- " + str1 + ", длина строки: " + len1);
        }
        if (len2 < average) {
            System.out.println("- " + str2 + ", длина строки: " + len2);
        }
        if (len3 < average) {
            System.out.println("- " + str3 + ", длина строки: " + len3);
        }
        scanner.close();
    }
}
