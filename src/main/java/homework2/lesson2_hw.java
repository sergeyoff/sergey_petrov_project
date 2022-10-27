package homework2;

import java.util.Scanner;

public class lesson2_hw {
    public static void main(String[] args) {
        task1_sumAB();
        CheckingAorPositiveNumber();
        CheckInteger();
        lineprinting();
        leapYearDefinition();
    }

    private static boolean task1_sumAB() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = console.nextInt();
        System.out.print("Введите число b: ");
        int b = console.nextInt();
        int sum = a + b;
        if (sum > 10 && sum <= 20)
            return true;
        else
            return false;
    }


    private static void CheckingAorPositiveNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = console.nextInt();
        if (a >= 0)
            System.out.println("Число " + a + " " + "положительное");
        else
            System.out.println("Число " + a + " " + " отрицательное");
    }

    private static boolean CheckInteger() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = console.nextInt();
        if (a >= 0 ) return true;
        else return false;
    }

    private static void lineprinting() {
        Scanner console = new Scanner(System.in);
        System.out.print("Напишите какую-нибудь строку: ");
        String str = console.nextLine();
        System.out.print("Сколько раз Вы хотите её повторить?  ");
        int n = console.nextInt();
        for (int i = 0; i< n; i++)
            System.out.println(str);
    }

    private static boolean leapYearDefinition() {
        Scanner console = new Scanner(System.in);
        System.out.print("Задайте года от Рождества Христова: ");
        int year = console.nextInt();
        if ((year % 4 == 0) || ((year % 100 != 0) && (year % 400 == 0)))
            System.out.println(year + " Указанный Вами год високосный");
        else
        System.out.println(year + " Этот год не високосный");
        return false;
    }
}
