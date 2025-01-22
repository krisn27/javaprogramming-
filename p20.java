
public class p20 {

    static void printodd(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 2, 34, 31};
        int n = arr.length;
        printodd(arr, n);
    }
}
