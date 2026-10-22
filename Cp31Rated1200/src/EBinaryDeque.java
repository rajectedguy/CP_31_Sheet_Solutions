import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EBinaryDeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int totalSum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                totalSum += a[i];
            }
            if (totalSum < s) {
                sb.append("-1\n");
                continue;
            }
            if (totalSum == s) {
                sb.append("0\n");
                continue;
            }
            int l = 0;
            int currentSum = 0;
            int maxLen = 0;
            for (int r = 0; r < n; r++) {
                currentSum += a[r];
                while (currentSum > s) {
                    currentSum -= a[l];
                    l++;
                }
                if (currentSum == s) {
                    maxLen = Math.max(maxLen, r - l + 1);
                }
            }
            sb.append(n - maxLen).append("\n");
        }
        System.out.print(sb);
    }
}