package Homework_4;

import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        //создание матрицы
        char[][] board = new char[3][3];
        //первый игрок - X
        char player = 'X';
        Scanner scan = new Scanner(System.in);
        //заполняем доску
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        while (true) {
            //выводим доску
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }
            //ход игрока
            System.out.print("Игрок " + player + ", введите строку и столбец через пробел: ");
            int row = scan.nextInt();
            int col = scan.nextInt();
            //проверяем ход
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Неверный ход! Введите значения еще раз");
                continue;
            }
            //записываем ход
            board[row][col] = player;
            //проверяем победу
            boolean win = false;
            //проверяем строки и столбцы
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) win = true;
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) win = true;
            }
            //проверяем диагонали
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) win = true;
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) win = true;
            if (win) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Игрок " + player + " победил!");
                break;
            }
            //проверяем ничью
            boolean isFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        isFull = false;
                        break;
                    }
                }
            }
            if (isFull) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Ничья!");
                break;
            }
            //меняем игрока
            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
        }
        scan.close();
    }
}
