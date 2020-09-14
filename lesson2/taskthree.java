import java.util.Scanner;

public class taskthree{
    public static void main (String [] args)
    {
        System.out.println("¬ведите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0)
            System.out.println(a + 1);
        else
            System.out.println(a);
    }
}