
public class p58 {

    static int maximumsubarraysum(int arr[], int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        System.out.println(maximumsubarraysum(arr, n));
    }
}
