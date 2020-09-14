import java.util.Scanner;

public class taskfour{
    public static void main (String [] args)
    {
        System.out.println("¬ведите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0)
            System.out.println(a + 1);
        else if (a < 0)
            System.out.println(a - 2);
        else
            System.out.println(a = 10);
    }
}