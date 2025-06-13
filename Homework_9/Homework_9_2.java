package Homework_9;

import java.util.LinkedList;

public class Homework_9_2 {
    private final LinkedList<String> animals = new LinkedList<>();

    //добавление в начало
    public void addAnimal(String animal) {
        System.out.println("Добавляем: " + animal);
        animals.addFirst(animal);
    }

    //удаление с конца
    public void removeAnimal() {
        if (!animals.isEmpty()) {
            String removed = animals.removeLast();
            System.out.println("Удаляем: " + removed);
        } else {
            System.out.println("Нечего удалять!");
        }
    }

    //вывод
    public void printAnimals() {
        System.out.println("В коллекции: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println("\n");
    }
}
