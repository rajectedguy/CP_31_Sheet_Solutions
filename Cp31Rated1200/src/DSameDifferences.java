import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DSameDifferences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            long pairs = 0;

            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken()) - i;
                int count = map.getOrDefault(val, 0);
                pairs += count;
                map.put(val, count + 1);
            }
            sb.append(pairs).append("\n");
        }
        System.out.print(sb);
    }
}
