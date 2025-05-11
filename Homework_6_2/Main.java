package Homework_6_2;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(6, 3, 9);
        figures[1] = new Rectangle(6, 5);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(2, 3);
        figures[4] = new Rectangle(4, 6);

        int totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += (int) figure.getPerimeter();
        }
        System.out.printf("Сумма периметров всех фигур = " + totalPerimeter);
    }
}
