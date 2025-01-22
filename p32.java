//search in rotated sorted array

public class p32 {

    static int search(int arr[], int n, int target) {
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[s] <= arr[mid]) {
                if (arr[s] <= target && target <= arr[e]) {
                    e = mid - 1;

                } else {
                    s = mid + 1;
                }

            } else {
                if (arr[mid] <= target && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 11, 0, 1, 2};
        int n = arr.length;
        int target = 0;
        System.out.println(search(arr, n, target));
    }
}
