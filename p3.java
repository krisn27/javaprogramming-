
public class p3 {

    static int printsubarraysum(int arr[], int n) {
        int maxendinghere = arr[0];
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            maxendinghere = Math.max(maxendinghere + arr[i], arr[i]);

            res = Math.max(res, maxendinghere);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        System.out.println(printsubarraysum(arr, n));
    }
}

/*Time complexity:O(n);
space complexity:O(1);*/
