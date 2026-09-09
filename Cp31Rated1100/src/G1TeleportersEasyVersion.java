import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G1TeleportersEasyVersion {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[] costs = new long[n];
            for (int i = 0; i < n; i++) {
                long ai = sc.nextLong();
                costs[i] = (i + 1) + ai;
            }
            Arrays.sort(costs);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (c >= costs[i]) {
                    c -= costs[i];
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
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
