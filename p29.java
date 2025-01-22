
public class p29 {

    static int printmaxprofit(int arr[], int n) {
        int maxprofit = 0;
        int mini = arr[0];
        for (int i = 1; i < n; i++) {
            int currprofit = arr[i] - mini;
            maxprofit = Math.max(maxprofit, currprofit);
            mini = Math.min(mini, arr[i]);
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 7, 8, 6};
        int n = arr.length;
        System.out.println("the maximum profit gained will be:" + printmaxprofit(arr, n));
    }
}
