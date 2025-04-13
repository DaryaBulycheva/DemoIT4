package Homework_1;

public class Homework_1_3 {
    public static void main(String[] args) {
        int a, b, c, d, n;
        n = 236;
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;
        d = a + b + c;

        System.out.println(d);
    }
}