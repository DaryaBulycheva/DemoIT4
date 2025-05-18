package Homework_8;

import java.util.Scanner;

public class Homework_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        if (hasUnique(str1)) {
            System.out.println("Первое слово с уникальными символами: " + str1);
        } else if (hasUnique(str2)) {
            System.out.println("Первое слово с уникальными символами: " + str2);
        } else if (hasUnique(str3)) {
            System.out.println("Первое слово с уникальными символами: " + str3);
        } else {
            System.out.println("Нет слов с уникальными символами!");
        }
        scanner.close();
    }

    //проверка, все ли символы в строке уникальны
    private static boolean hasUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
