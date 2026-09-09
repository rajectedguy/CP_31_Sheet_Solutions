import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BGCDPartition {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                totalSum += a[i];
            }
            long maxGcd = 1;
            long currentPrefixSum = 0;
            for (int i = 0; i < n - 1; i++) {
                currentPrefixSum += a[i];
                maxGcd = Math.max(maxGcd, gcd(currentPrefixSum, totalSum - currentPrefixSum));
            }
            out.println(maxGcd);
        }
        out.flush();
    }
    public static long gcd(long a, long b) {
        while (b != 0) {
            a %= b;
            long temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
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
}
