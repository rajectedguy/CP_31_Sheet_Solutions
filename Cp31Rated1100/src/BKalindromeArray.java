import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BKalindromeArray {
    static FastReader sc = new FastReader();
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
    static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;
        int val1 = -1, val2 = -1;
        while (i < j) {
            if (a[i] != a[j]) {
                val1 = a[i];
                val2 = a[j];
                break;
            }
            i++;
            j--;
        }
        if (val1 == -1) {
            System.out.println("YES");
            return;
        }
        if (isPalindrome(a, val1) || isPalindrome(a, val2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isPalindrome(int[] a, int x) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] == x) {
                i++;
            } else if (a[j] == x) {
                j--;
            } else if (a[i] != a[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    }
}
