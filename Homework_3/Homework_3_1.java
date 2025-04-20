package Homework_3;

import java.util.Random;
import java.util.Scanner;

public class Homework_3_1 {

    public static void main(String[] args) {
        //считываем число, которое ввел пользователь
        int a;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите простое целое число: ");
            //проверка целое ли число
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                //проверка положительное ли число
                if (a > 0) {
                    int counter = 0;
                    for (int j = 1; j <= a; j++) {
                        if (a % j == 0) {
                            counter++;
                        }
                    }
                    //проверка простое ли число
                    if (counter == 2) {
                        break;
                    } else {
                        System.out.println("Ошибка: число должно быть простое");
                    }
                } else {
                    System.out.println("Ошибка: число должно быть положительное");
                }
            } else {
                System.out.println("Ошибка: число должно быть целое");
                scanner.next();
            }
        }
        //обявляем массив, длина которого равна числу, введенному пользователем
        int[] mass = new int[a];
        //заполняем массив рандомными значениями
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            //заполняю рандомными числами до 100 для наглядности
            mass[i] = random.nextInt(100);
        }
        System.out.println("Задание 1");
        //вывод массива в прямом порядке
        for (int mas : mass) {
            System.out.print(mas + " ");
        }
        System.out.println();
        //вывод массива в обратном порядке
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 2");
        //поиск минимального элемента
        int min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.print(min);
        System.out.println();
        //поиск максимального элемента
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.print(max);
        System.out.println();
        System.out.println("Задание 3");
        //поиск индекса минимального элемента
        int index_min = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == min) {
                index_min = i;
            }
        }
        System.out.print(index_min);
        System.out.println();
        //поиск индекса максимального элемента
        int index_max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                index_max = i;
            }
        }
        System.out.print(index_max);
        System.out.println();
        System.out.println("Задание 4");
        //поиск количества нулевых элементов
        int counter = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.print(counter);
        } else {
            System.out.print("Нулевых элементов нет");
        }
        System.out.println();
        System.out.println("Задание 5");
        //перемена элементов местами
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = temp;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 6");
        //проверка на возрастание последовательности
        boolean counter = true;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] <= mass[i - 1]) {
                counter = false;
                break;
            }
        }
        if (counter) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
