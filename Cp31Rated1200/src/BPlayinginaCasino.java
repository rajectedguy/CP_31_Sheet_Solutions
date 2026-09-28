import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BPlayinginaCasino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] columns = new int[m][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    columns[j][i] = Integer.parseInt(st.nextToken());
                }
            }
            long totalWinnings = 0;
            for (int j = 0; j < m; j++) {
                Arrays.sort(columns[j]);
                for (int i = 0; i < n; i++) {
                    totalWinnings += (long) columns[j][i] * (2 * i - n + 1);
                }
            }
            sb.append(totalWinnings).append("\n");
        }
        System.out.print(sb);
    }
}
