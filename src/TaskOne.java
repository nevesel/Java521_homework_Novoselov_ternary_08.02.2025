import java.util.Scanner;

//TODO: Напишите программу, которая проверяет, является ли введенное пользователем
// число четным или нечетным, с помощью тернарного оператора.

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        System.out.println("Введено число " + "'" + num + "'");
        System.out.println(num % 2 == 0 ? "Число чётное" : "Число нечётное");
    }
}
