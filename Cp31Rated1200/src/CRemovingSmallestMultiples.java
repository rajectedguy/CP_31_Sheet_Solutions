import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CRemovingSmallestMultiples {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                String s = br.readLine();
                boolean[] visited = new boolean[n];
                long totalCost = 0;
                for (int k = 1; k <= n; k++) {
                    for (int m = k; m <= n; m += k) {
                        if (s.charAt(m - 1) == '1') {
                            break;
                        }
                        if (!visited[m - 1]) {
                            visited[m - 1] = true;
                            totalCost += k;
                        }
                    }
                }
                sb.append(totalCost).append("\n");
            }
            System.out.print(sb);
    }
}