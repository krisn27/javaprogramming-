
public class p40 {

    static int printunique(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 1, 3, 4, 4};
        int n = arr.length;
        System.out.println(printunique(arr, n));
    }
}
