//rotate array elements left by k

public class p21 {

    static void rotatearray(int arr[], int n, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

    }

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 2, 5, 1, 6, 4};
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int k = 3;
        rotatearray(arr, n, k);
        printarray(arr, n);
    }
}
