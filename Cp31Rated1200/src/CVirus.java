import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class CVirus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            long n = Long.parseLong(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            long[] a = new long[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(a);
            Long[] segments = new Long[m];
            for (int i = 0; i < m - 1; i++) {
                segments[i] = a[i + 1] - a[i] - 1;
            }
            segments[m - 1] = (n - a[m - 1]) + a[0] - 1;
            Arrays.sort(segments, Collections.reverseOrder());
            long saved = 0;
            long daysPassed = 0;
            for (int i = 0; i < m; i++) {
                long currentLength = segments[i] - 2 * daysPassed;
                if (currentLength <= 0) {
                    break;
                }
                if (currentLength == 1 || currentLength == 2) {
                    saved += 1;
                    daysPassed += 1;
                } else {
                    saved += (currentLength - 1);
                    daysPassed += 2;
                }
            }
            long totalInfected = n - saved;
            sb.append(totalInfected).append("\n");
        }
        System.out.print(sb);
    }
}
