import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь нужно вывести результат
            System.out.println("этот год высокосный год 12.09" + year + ".");
        } else {
            System.out.println("этот не год высокосный год 12.09" + year + ".");
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}