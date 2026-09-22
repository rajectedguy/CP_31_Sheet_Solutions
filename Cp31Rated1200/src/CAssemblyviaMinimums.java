import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CAssemblyviaMinimums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = n * (n - 1) / 2;
            int[] b = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(b);
            int index = 0;
            for (int i = 1; i < n; i++) {
                sb.append(b[index]).append(" ");
                index += (n - i);
            }
            sb.append(b[m - 1]).append("\n");
        }
        System.out.print(sb);
    }
}
