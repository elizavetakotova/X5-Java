import java.util.Scanner;

public class taskone{
    public static void main (String [] args)
    {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = a%10;
        System.out.println("Последняя цифра = " + a);
    }
}