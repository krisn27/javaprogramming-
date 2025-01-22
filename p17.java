 //merge of two arrays

import java.util.*;

public class p17 {

    static void mergearrays(int arr1[], int arr2[], int n1, int n2, int arr3[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1) {
            arr3[k++] = arr1[i++];

        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
    }

    public static void main(String[] args) {
        int arr1[] = {4, 6, 3, 8};
        int n1 = arr1.length;
        int arr2[] = {9, 2, 3, 4};
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        mergearrays(arr1, arr2, n1, n2, arr3);
        for (int l = 0; l < (n1 + n2); l++) {
            System.out.print(arr3[l]);

        }

    }
}
