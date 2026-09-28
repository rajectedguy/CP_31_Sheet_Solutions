import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EScuza {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            long[] a = new long[n];
            long[] prefSum = new long[n];
            long[] prefMax = new long[n];
            st = new StringTokenizer(br.readLine());
            long currentMax = 0;
            long currentSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                currentSum += a[i];
                prefSum[i] = currentSum;
                currentMax = Math.max(currentMax, a[i]);
                prefMax[i] = currentMax;
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < q; i++) {
                long k = Long.parseLong(st.nextToken());
                int ansIdx = binarySearch(prefMax, k);
                if (ansIdx == -1) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(prefSum[ansIdx]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    private static int binarySearch(long[] prefMax, long k) {
        int low = 0;
        int high = prefMax.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prefMax[mid] <= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}