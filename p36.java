
import java.util.HashSet;

public class p36 {

    static void removeduplicate(int arr[]) {
        HashSet<Integer> h = new HashSet<>();
        for (int num : arr) {
            h.add(num);
        }
        System.out.println(h);

    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 7, 8, 5, 4, 3, 4, 3};
        //int n = arr.length;
        removeduplicate(arr);
    }
}
