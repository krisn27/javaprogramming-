
public class p5 {

    public static void main(String args[]) {
        String A = "radar";
        int start = 0, end = A.length() - 1;
        for (int i = 0; i < A.length(); i++) {
            while (start <= end) {
                if (A.charAt(start) == A.charAt(end)) {
                    start++;
                    end--;
                } else {
                    System.out.println("A is not palidrome");
                    break;
                }
            }
            // System.out.println("A is palidrome");
        }

        System.out.println("A is palidrome");
    }
}
