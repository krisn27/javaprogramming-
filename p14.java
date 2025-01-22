
public class p14 {

    static void printleaders(int arr[], int n) {
        int maxfromright = arr[n - 1];
        System.out.println(maxfromright);

        for (int i = n - 2; i >= 0; i--) {
            if (maxfromright < arr[i]) {
                maxfromright = arr[i];
                System.out.println(maxfromright);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printleaders(arr, n);
    }
}
/*
 in first step put maxfromright=arr[n];
 then after iterate loop from n-2 to 1 and then 

 */
