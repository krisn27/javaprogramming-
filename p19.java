
public class p19 {

    static void printeven(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 9, 7, 23};
        int n = arr.length;
        printeven(arr, n);
    }
}
