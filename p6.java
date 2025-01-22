
public class p6 {

    public static void main(String args[]) {
        int A[] = {5, 1, 4, 2, 8};
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}
