import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CContrastValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            List<Integer> unique = new ArrayList<>();
            unique.add(a[0]);
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    unique.add(a[i]);
                }
            }
            if (unique.size() == 1) {
                sb.append(1).append("\n");
                continue;
            }
            int count = 2;
            for (int i = 1; i < unique.size() - 1; i++) {
                int prev = unique.get(i - 1);
                int curr = unique.get(i);
                int next = unique.get(i + 1);
                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}