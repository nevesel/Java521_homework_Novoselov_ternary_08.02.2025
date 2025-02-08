import java.util.Scanner;

public class Task2 {
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
