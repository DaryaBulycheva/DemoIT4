package Homework_7;

public class Main {

    public static void main(String[] args) {
        Homework_7 demo = new Homework_7();

        //метод 1
        System.out.println("1. try-catch");
        System.out.println("1.1 Корректные данные:");
        System.out.println("Результат: " + demo.first(10, 2));
        System.out.println("1.2 Деление на ноль:");
        System.out.println("Результат: " + demo.first(10, 0));
        System.out.println("--------------------");

        //метод 2
        System.out.println("2. try-catch, где catch будет несколько");
        System.out.println("2.1 Корректные данные:");
        demo.second(20, 5, 1);
        System.out.println("2.2 Деление на ноль:");
        demo.second(15, 0, 0);
        System.out.println("2.3 Неверный индекс элемента массива:");
        demo.second(10, 2, 5);
        System.out.println("--------------------");

        //метод 3
        System.out.println("3. try-catch, с использованием multi - catch");
        System.out.println("3.1 Корректный массив:");
        demo.third(new int[]{1, 2, 3}, 1);
        System.out.println("3.2 Неверный индекс:");
        demo.third(new int[]{1, 2, 3}, 5);
        System.out.println("3.3 Массив null:");
        demo.third(null, 0);
        System.out.println("--------------------");

        //метод 4
        System.out.println("4. try-catch-finally");
        System.out.println("4.1 Работа со строкой:");
        demo.fourth("Bulycheva");
        System.out.println("4.2 Передача null:");
        demo.fourth(null);
    }
}