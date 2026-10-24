import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CDolceVita {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(a);
            long[] prefixSum = new long[n];
            prefixSum[0] = a[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }
            long totalPacks = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (x >= prefixSum[i]) {
                    long totalDaysAffordable = (x - prefixSum[i]) / (i + 1) + 1;
                    totalPacks += totalDaysAffordable;
                }
            }
            sb.append(totalPacks).append("\n");
        }
        System.out.print(sb);
    }
}
