import java.util.Scanner;

public class taskone{
    public static void main (String [] args)
    {
        System.out.println("������� �����: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = a%10;
        System.out.println("��������� ����� = " + a);
    }
}