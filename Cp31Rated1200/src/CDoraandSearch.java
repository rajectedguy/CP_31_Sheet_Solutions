import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CDoraandSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int l = 1;
            int r = n;
            int minVal = 1;
            int maxVal = n;
            boolean found = false;
            while (l <= r) {
                if (a[l] == minVal) {
                    l++;
                    minVal++;
                } else if (a[l] == maxVal) {
                    l++;
                    maxVal--;
                } else if (a[r] == minVal) {
                    r--;
                    minVal++;
                } else if (a[r] == maxVal) {
                    r--;
                    maxVal--;
                } else {
                    found = true;
                    break;
                }
            }
            if (found && l < r) {
                sb.append(l).append(" ").append(r).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        System.out.print(sb);
    }
}
