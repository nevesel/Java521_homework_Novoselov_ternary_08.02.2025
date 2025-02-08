import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        int two = 2;
        int fife = 5;
        int three = 3;
        int seven = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите проверяемое число: ");
        int num = scanner.nextInt();

        if((num % two == 0) && (num % fife == 0))
            System.out.println("Проверяемое число делится на 2 и 5"); else System.out.println("Проверяемое число не делится на 2 и 5");

        if((num % three == 0) && (num % seven == 0))
            System.out.println("Проверяемое число делится на 3 и 7"); else System.out.println("Проверяемое число не делится на 3 и 7");
    }

}
