package src.Homework_5_1;

public class Main {

    public static void main(String[] args) {
        //создание карты 1
        CreditCard creditCard1 = new CreditCard();
        creditCard1.number = 1;
        creditCard1.total = 100;
        //создание карты 2
        CreditCard creditCard2 = new CreditCard();
        creditCard2.number = 2;
        creditCard2.total = 200;
        //создание карты 3
        CreditCard creditCard3 = new CreditCard();
        creditCard3.number = 3;
        creditCard3.total = 300;
        //тестовый сценарий (действия с деньгами)
        creditCard1.addCash(90);
        creditCard2.addCash(60);
        creditCard3.subCash(30);
        //вывод состояния
        creditCard1.showInfo();
        System.out.println("--------");
        creditCard2.showInfo();
        System.out.println("--------");
        creditCard3.showInfo();
    }
}
