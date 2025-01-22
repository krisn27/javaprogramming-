//find first nonrepeating array

import java.util.HashMap;

public class p41 {

    static int firstnonrepeating(int arr[], int n) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);

            } else {
                m.put(arr[i], 1);
            }

        }
        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) == 1) {
                return arr[i];
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = {9, 1, 9, 3, 6, 3, 1};
        int n = arr.length;
        System.out.println("the first non repeating number is:" + firstnonrepeating(arr, n));
    }
}
