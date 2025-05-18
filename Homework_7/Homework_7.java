package Homework_7;

public class Homework_7 {
    // 1.try-catch
    public int first(int a, int b) {
        try {
            return a / b; //Возвращается результат при делении
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления: " + e.getMessage());
            return 0; //Возвращается 0 при ошибке деления
        }
    }

    // 2.try-catch, где catch будет несколько
    public void second(int a, int b, int index) {
        int[] numbers = {10, 20, 30};
        try {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
            System.out.println("Элемент массива с индексом " + index + ": " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс массива! Допустимо 0-" + (numbers.length - 1));
        }
    }

    // 3.try-catch, с использованием multi - catch
    public void third(int[] array, int index) {
        try {
            System.out.println("Элемент массива: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // 4.try-catch-finally
    public void fourth(String text) {
        try {
            System.out.println("Длина строки: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: строка null!");
        } finally {
            System.out.println("Строка выводится в любом случае");
        }
    }
}