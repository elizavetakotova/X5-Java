import java.util.Scanner;

public class tasktwo{
    public static void main (String [] args)
    {
        System.out.println("������� ����������� �����: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = (a/100) +((a/10)%10) + (a%10);
        System.out.println("����� ���� ������������ ����� = " + sum);
    }
}