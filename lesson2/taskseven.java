import java.util.Scanner;

public class taskseven{
    public static void main (String [] args)
    {
        System.out.println("������� ��� ������: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case (905):
            {double b = 4.15*10;
                System.out.println("������. ��������� ��������� = " + b);}
            break;
            case (194):
            {double c = 1.98*10;
                System.out.println("������. ��������� ��������� = " + c);}
            break;
            case (491):
            {double d = 2.69*10;
                System.out.println("���������. ��������� ��������� = " + d);}
            break;
            case (800):
            {double e = 5.00*10;
                System.out.println("�����. ��������� ��������� = " + e);}
            break;
            default:
                System.out.println("��� ������ �� ������");
        }
    }
}