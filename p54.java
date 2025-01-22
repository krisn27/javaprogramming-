
public class p54 {

    static void printpermutation(String s, String prefix) {
        if (s.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String rem = s.substring(0, i) + s.substring(i + 1);
                printpermutation(rem, prefix + s.charAt(i));

            }
        }
    }

    public static void main(String args[]) {
        String s = "abc";
        printpermutation(s, "");

    }
}
