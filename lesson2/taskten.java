public class taskten{
    public static void main (String[] args)
    {
        int[] A = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int n = A.length;
        int b;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (A[i] == 0){
                    b = A[j];
                    A[j] = A[i];
                    A[i] = b;}
            }
        }
        System.out.println("����� ������: ");
        for (int i = 0; i < n; i++)
            System.out.println(A[i]);
    }
}
