
import java.util.*;

public class p56 {

    static String reversewords(String str) {
        String words[] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }

    public static void main(String args[]) {
        String str = "this is man";
        System.out.println(reversewords(str));
    }
}
