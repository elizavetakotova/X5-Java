public class tasknine{
    public static void main (String[] args)
    {
        int[] A = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int n = A.length;
        int b;
        for (int i = 0; i < n/2; i++) {
            b = A[n-i-1];
            A[n-i-1] = A[i];
            A[i] = b;
        }
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.println(A[i]);
    }
}
