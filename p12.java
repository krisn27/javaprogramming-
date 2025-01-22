
public class p12 {

    static void bubblesort(int arr[], int n) {
        int temp;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 10, 13, 11, 4, 8, 3};
        int n = arr.length;
        bubblesort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
