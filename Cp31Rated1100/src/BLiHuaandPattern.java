import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BLiHuaandPattern {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
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
        long nextLong() { return Long.parseLong(next()); }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long k = fr.nextLong();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = fr.nextInt();
                }
            }
            long diff = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[n - 1 - i][n - 1 - j]) {
                        diff++;
                    }
                }
            }
            diff /= 2;
            if (k < diff) {
                out.println("NO");
            } else {
                long remaining = k - diff;
                if (n % 2 != 0 || remaining % 2 == 0) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
        }
        out.flush();
        out.close();
    }
}
