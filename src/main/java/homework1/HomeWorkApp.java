package homework1;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = console.nextInt();
        System.out.print("Введите число b: ");
        int b = console.nextInt();
        int sum = a + b;
        System.out.println("Сумма чисел a и b: " + sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числовую переменную для определения цвета: ");
        int value = console.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    private static void compareNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = console.nextInt();
        System.out.print("Введите число b: ");
        int b = console.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }

    }


}
