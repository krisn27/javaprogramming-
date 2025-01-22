//median of two array

import java.util.*;

public class p18 {

    static void getmiddle(int arr[], int n) {
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int id1 = (n / 2) - 1;
            int id2 = (n / 2);
            System.out.println((float) (arr[id1] + arr[id2]) / 2);
        } else {
            System.out.println(arr[n / 2]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 5, 2, 3, 4, 7,8};
        int n = arr.length;
        getmiddle(arr, n);
    }
}
