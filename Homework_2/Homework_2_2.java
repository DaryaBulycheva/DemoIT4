package Homework_2;

import java.util.Scanner;

public class Homework_2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
