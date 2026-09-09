import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ENegativesandPositives {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long totalAbsSum = 0;
            long minAbsValue = Long.MAX_VALUE;
            int negativeCount = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] < 0) {
                    negativeCount++;
                }
                long absVal = Math.abs(a[i]);
                totalAbsSum += absVal;
                minAbsValue = Math.min(minAbsValue, absVal);
            }
            if (negativeCount % 2 == 0) {
                System.out.println(totalAbsSum);
            } else {
                System.out.println(totalAbsSum - 2 * minAbsValue);
            }
        }
    }
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
