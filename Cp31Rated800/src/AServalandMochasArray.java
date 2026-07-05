import java.io.*;
import java.util.*;

public class AServalandMochasArray {
    public static int gcd(int a, int b) {
        while (b > 0) {
            a %= b;
            int temp = a;
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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) <= 2) {
                        possible = true;
                        break;
                    }
                }
                if (possible) break;
            }
            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static void main(String[] args) {
        solve();
    }
}