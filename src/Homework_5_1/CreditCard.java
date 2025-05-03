package src.Homework_5_1;

public class CreditCard {
    int number;
    int total;

    //метод для добавления денег на карту
    public void addCash(int value) {
        total = total + value;
    }

    //метод для снятия денег с карты
    public void subCash(int value) {
        total = total - value;
    }

    //метод для возврата текущей информации
    public void showInfo() {
        System.out.println("Номер карты = " + number);
        System.out.println("Текущее состояние карты = " + total);
    }
}
