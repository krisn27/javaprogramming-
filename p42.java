
public class p42 {

    static void printaccess(String str) {
        char[] ch = str.toCharArray();
        System.out.println(ch[4]);
    }

    public static void main(String args[]) {
        String str = "abcdefgh";
        printaccess(str);
    }
}
