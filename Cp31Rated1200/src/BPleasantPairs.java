import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BPleasantPairs {
    public static void main(String[] resignation) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long[] a = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            int pleasantPairsCount = 0;
            for (int i = 1; i <= n; i++) {
                // and results in a j > i.
                long remainder = (i + i) % a[i];
                long startJ = a[i] - remainder;
                if (startJ == 0) {
                    startJ += a[i];
                }
                long j = i + startJ;
                while (j <= n) {
                    if (a[i] * a[(int)j] == i + j) {
                        pleasantPairsCount++;
                    }
                    j += a[i];
                }
            }
            sb.append(pleasantPairsCount).append("\n");
        }
        System.out.print(sb);
    }
}
