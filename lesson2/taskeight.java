public class taskeight{
    public static void main (String[] args)
    {
        int[] A = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int max = A[0];
        int sump = 0;
        int sumcho = 0;
        int kolpe = 0;
        double sum = 0;
        double sar = 0;
        int kol = 0;

        for (int i = 0; i < 14; i++) {
            if (max < A[i])
                max = A[i];
        }
        System.out.println("������������ �������� ������� = " + max);

        for (int i = 0; i < 14; i++) {
            if (A[i] > 0)
                sump = sump + A[i];
        }
        System.out.println("����� ������������� ��������� = " + sump);

        for (int i = 0; i < 14; i++) {
            if ((A[i] < 0) && (A[i]%2==0))
                sumcho = sumcho + A[i];
        }
        System.out.println("����� ������ ������������� ��������� = " + sumcho);

        for (int i = 0; i < 14; i++) {
            if ((A[i] > 0))
                kolpe = kolpe + 1;
        }
        System.out.println("���������� ������������� ��������� = " + kolpe);

        for (int i = 0; i < 14; i++) {
            if ((A[i] < 0)){
                sum = sum + A[i];
                kol = kol + 1;}
        }
        sar = sum/kol;
        System.out.println("������� �������������� ������������� ��������� = " + sar);
    }
}