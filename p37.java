
public class p37 {

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int n = -42;
        if (isprime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + "is not prime number");
        }

    }
}
