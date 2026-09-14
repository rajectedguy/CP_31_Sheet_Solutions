import java.util.Scanner;

public class CPainttheArray {
    public static long gcd(long a, long b) {
        while (b > 0) {
            a %= b;
            long temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long g1 = 0;
            for (int i = 0; i < n; i += 2) {
                g1 = gcd(g1, a[i]);
            }
            long g2 = 0;
            for (int i = 1; i < n; i += 2) {
                g2 = gcd(g2, a[i]);
            }
            long result = 0;
            boolean ok1 = true;
            for (int i = 1; i < n; i += 2) {
                if (a[i] % g1 == 0) {
                    ok1 = false;
                    break;
                }
            }
            if (ok1) {
                result = g1;
            } else {
                boolean ok2 = true;
                for (int i = 0; i < n; i += 2) {
                    if (a[i] % g2 == 0) {
                        ok2 = false;
                        break;
                    }
                }
                if (ok2) result = g2;
            }
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        solve();
    }
}
