import java.util.Scanner;

public class tasksix{
    public static void main (String [] args)
    {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0)
            System.out.println("Нулевое число");

        else if (a > 0)
        { if (a%2==0)
            System.out.println("Положительное четное число");
        else
            System.out.println("Положительное нечетное число"); }

        else if (a < 0)
        {if (a%2==0)
            System.out.println("Отрицательное четное число");
        else
            System.out.println("Отрицательное нечетное число");
        }

    }
}