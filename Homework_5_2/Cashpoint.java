package Homework_5_2;

public class Cashpoint {
    //кол-во банкнот разного номинала
    int banknote20;
    int banknote50;
    int banknote100;
    //общее кол-во банконот до добавления
    int total;

    //конструктор
    public Cashpoint(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    //метод для добавления денег в банкомат
    public void addCash(int value20, int value50, int value100) {
        int cash = value20 * 20 + value50 * 50 + value100 * 100;
        banknote20 = banknote20 + value20;
        banknote50 = banknote50 + value50;
        banknote100 = banknote100 + value100;
        total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100 + cash;
    }

    //метод для снятия денег
    public boolean subCash(int value) {
        if (total < value) {
            return false;
        } else {
            int count100 = 0;
            int tempbanknote100 = banknote100;
            for (int i = 0; tempbanknote100 != 0 && value >= 100; i++) {
                count100++;
                tempbanknote100 = tempbanknote100 - 1;
                value = value - 100;
            }
            int count50 = 0;
            int tempbanknote50 = banknote50;
            for (int i = 0; tempbanknote50 != 0 && value >= 50; i++) {
                if (value == 60 || value == 80) break;
                count50++;
                tempbanknote50 = tempbanknote50 - 1;
                value = value - 50;
            }
            int tempbanknote20 = banknote20;
            int count20 = 0;
            for (int i = 0; tempbanknote20 != 0 && value >= 20; i++) {
                count20++;
                tempbanknote20 = tempbanknote20 - 1;
                value = value - 20;
            }
            if (value == 0) {
                banknote100 = banknote100 - count100;
                banknote20 = banknote20 - count20;
                banknote50 = banknote50 - count50;
                System.out.println("Выдано купюр номиналом 100 = " + count100);
                System.out.println("Выдано купюр номиналом 50 = " + count50);
                System.out.println("Выдано купюр номиналом 20 = " + count20);
                return true;
            } else {
                System.out.println("Число не раскладывается на необходимый номинал купюр");
                return false;
            }
        }
    }
}
