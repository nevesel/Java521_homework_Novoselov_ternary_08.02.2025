import java.util.Scanner;

//TODO: Напишите программу, которая сравнивает два введенных числа и выводит наибольшее из них
// с использованием тернарного оператора.

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 > num2 ? "Наибольшее число: " + num1 : "Наибольшее число- " + num2);
    }
}