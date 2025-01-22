
import java.util.Arrays;

public class p51 {

    public int[] twosum(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 8, 4};
        int n = arr.length;
        int target = 11;
        p51 obj = new p51();

        // Fix printing issue
        int[] result = obj.twosum(arr, n, target);
        System.out.println(Arrays.toString(result));
    }
}
