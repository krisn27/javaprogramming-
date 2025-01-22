//kadanes algorithm

public class p31 {

    static int maxsubarraysum(int arr[], int n) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, -5, 4};
        int n = arr.length;
        System.out.println(maxsubarraysum(arr, n));
    }
}
