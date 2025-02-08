import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        System.out.println("Введено число " + "'" + num + "'");
        System.out.println(num%2 == 0 ? "Число чётное" : "Число нечётное");
    }
}
