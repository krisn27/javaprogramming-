
public class p25 {

    static void printleader(int arr[], int n) {

        if (arr[n - 1] > arr[n - 2]) {
            System.out.println(arr[n - 1]);

        }
        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
        }
        for (int i = 1; i <= n - 2; i++) {

            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = {9, 4, 8, 6, 7};
        int n = arr.length;
        printleader(arr, n);
    }
}
