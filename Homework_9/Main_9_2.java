package Homework_9;

public class Main_9_2 {
    public static void main(String[] args) {
        Homework_9_2 homeAnimals = new Homework_9_2();
        //проверка "Нечего удалять!"
        homeAnimals.removeAnimal();
        //добавление
        homeAnimals.addAnimal("Кот");
        homeAnimals.printAnimals();
        homeAnimals.addAnimal("Пес");
        homeAnimals.printAnimals();
        homeAnimals.addAnimal("Черепаха");
        homeAnimals.printAnimals();
        //удаление
        homeAnimals.removeAnimal();
        homeAnimals.printAnimals();
        homeAnimals.removeAnimal();
        homeAnimals.printAnimals();
    }
}
