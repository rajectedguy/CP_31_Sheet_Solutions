import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BMaximumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            long[] a = new long[n];
            String[] secondLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(secondLine[i]);
            }
            Arrays.sort(a);
            long[] prefixSum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + a[i];
            }
            long maxSum = 0;
            for (int i = 0; i <= k; i++) {
                int removalsFromLeft = 2 * i;
                int removalsFromRight = k - i;
                long currentSum = prefixSum[n - removalsFromRight] - prefixSum[removalsFromLeft];
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println(maxSum);
        }
    }
}