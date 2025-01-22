//q.find minimum in rotated sorted array

public class p30 {

    static int printmin(int arr[], int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;

            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }

        }
        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println(printmin(arr, n));
    }
}
