package Homework_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_9_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        ArrayList<String> list = new ArrayList<>();
        for (String part : parts) {
            String number = part.trim();
            if (!number.isEmpty()) {
                if (!list.contains(number)) {
                    list.add(number);
                }
            }
        }
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                result += ", ";
            }
            result += list.get(i);
        }
        System.out.println("Без повторений: " + result);
        scanner.close();
    }
}
