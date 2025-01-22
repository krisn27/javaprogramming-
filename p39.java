
public class p39 {

    static boolean printarrayequals(int a1[], int a2[]) {
        int n1 = a1.length;
        int n2 = a2.length;
        if (n1 != n2) {
            return false;
        }

        for (int i = 0; i < n1; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int a1[] = {3, 4, 5, 7, 9};
        int a2[] = {3, 4, 5, 7, 9};

        if (printarrayequals(a1, a2)) {
            System.out.println("a1 and a2 are equals");
        } else {
            System.out.println("a1 and a2 are not equals");
        }
    }
}
