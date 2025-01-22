
/*public class p26 {

    static int maxwatercontainer(int arr[], int n) {
        //int left, right;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = (j - i);
                int height = Math.min(arr[i], arr[j]);
                int area = height * width;
                ans = Math.max(ans, area);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int n = arr.length;
        System.out.println(maxwatercontainer(arr, n));
    }
}*/
public class p26 {

    static int maxwatercontainer(int arr[], int n) {
        int lp = 0, rp = n - 1, ans = 0;
        while (lp < rp) {
            int width = rp - lp;
            int height = Math.min(arr[lp], arr[rp]);
            int area = width * height;
            ans = Math.max(ans, area);

            if (arr[lp] < arr[rp]) {
                lp++;

            } else {
                rp--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int n = arr.length;
        System.out.println(maxwatercontainer(arr, n));
    }
}
