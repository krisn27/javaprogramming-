
import java.util.Arrays;
import java.util.HashMap;

public class p27 {

    static void printrank(int arr[], int n) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int rank = 1;
        int brr[] = new int[n];

        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(brr[i])) {
                map.put(brr[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(map.get(arr[i]) + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = {5, 8, 9, 4, 3, 10};
        int n = arr.length;
        printrank(arr, n);
    }
}
