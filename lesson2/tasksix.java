import java.util.Scanner;

public class tasksix{
    public static void main (String [] args)
    {
        System.out.println("������� �����: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0)
            System.out.println("������� �����");

        else if (a > 0)
        { if (a%2==0)
            System.out.println("������������� ������ �����");
        else
            System.out.println("������������� �������� �����"); }

        else if (a < 0)
        {if (a%2==0)
            System.out.println("������������� ������ �����");
        else
            System.out.println("������������� �������� �����");
        }

    }
}