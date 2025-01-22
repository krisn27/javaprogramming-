
import java.util.Stack;

public class p47 {

    static String reverse(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> s = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            s.push(str.charAt(i));

        }
        int i = 0;
        String ans=" ";
        while (!s.isEmpty()) {
            ans[i++] = s.pop();
        }
        return new String(reverseString);

    }

    public static void main(String args[]) {
        String str = "krish";
        System.out.println(reverse(str));
    }
}
