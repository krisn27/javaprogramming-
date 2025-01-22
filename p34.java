
public class p34 {

    static int maxconsecutiveones(int arr[], int n) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 1, 1};
        int n = arr.length;
        System.out.println(maxconsecutiveones(arr, n));
    }
}
