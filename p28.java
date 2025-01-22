
import java.util.Arrays;

public class p28 {

    static int[] twosum(int arr[], int n, int target) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 6, 5, 1};
        int n = arr.length;
        int target = 50;
        int ans[] = twosum(arr, n, target);
        System.out.println(Arrays.toString(ans));

    }
}
