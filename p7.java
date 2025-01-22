
import java.util.*;

public class p7 {

    static int floorsqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x = sc.nextInt();
        System.out.println(floorsqrt(x));

    }
}
