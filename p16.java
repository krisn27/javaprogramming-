
public class p16 {

    static int sum(int arr[], int n) {
        int sum = 0;
        int avg;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        return (avg = sum / n);

    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 3, 7, 8, 2};
        int n = arr.length;
        System.out.println(sum(arr, n));
    }
}
