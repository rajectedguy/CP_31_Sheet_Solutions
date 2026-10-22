import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EMirrorGrid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                for (int j = 0; j < n; j++) {
                    grid[i][j] = line.charAt(j) - '0';
                }
            }
            int totalOperations = 0;
            for (int i = 0; i < (n + 1) / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int val1 = grid[i][j];
                    int val2 = grid[j][n - 1 - i];
                    int val3 = grid[n - 1 - i][n - 1 - j];
                    int val4 = grid[n - 1 - j][i];
                    int sum = val1 + val2 + val3 + val4;
                    totalOperations += Math.min(sum, 4 - sum);
                }
            }
            sb.append(totalOperations).append("\n");
        }
        System.out.print(sb);
    }
}
