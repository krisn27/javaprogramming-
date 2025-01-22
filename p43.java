
import java.util.Arrays;


/*public class p43 {

    static void printparticularString(String str) {
        char ch[] = str.toCharArray();
        System.out.println(ch[4]);
    }

    public static void main(String args[]) {
        String str = "abcdefgh";

        printparticularString(str);
    }
}*/
public class p43 {

    static boolean checkanagram(String str, String str1) {

        //String str1 = str.replace("you!", "java");
        //String str1 = str.concat("satyam pandey");
        // System.out.println(str.charAt(10));
        int n1 = str.length();
        int n2 = str1.length();
        if (n1 != n2) {
            return false;
        }
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        for (int i = 0; i < n1; i++) {
            if (ch[i] != ch1[i]) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str = "i love you!";
        String str1 = "you! love i";
        if (checkanagram(str, str1)) {
            System.out.println("the both string str and str1 are anagram");
        } else {
            System.out.println("the both string str and str1 are not anagram");
        }

    }
}
