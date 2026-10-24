import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CDifferentialSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            if (a[n - 2] > a[n - 1]) {
                sb.append("-1\n");
                continue;
            }
            if (a[n - 1] >= 0) {
                sb.append(n - 2).append("\n");
                for (int i = 1; i <= n - 2; i++) {
                    sb.append(i).append(" ").append(n - 1).append(" ").append(n).append("\n");
                }
            } else {
                boolean isSorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        isSorted = false;
                        break;
                    }
                }
                if (isSorted) {
                    sb.append("0\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        System.out.print(sb);
    }
}