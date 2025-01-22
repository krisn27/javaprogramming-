
public class p15 {

    static void printlargestelements(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 45, 7, 8};
        int n = arr.length;
        printlargestelements(arr, n);

    }
}
