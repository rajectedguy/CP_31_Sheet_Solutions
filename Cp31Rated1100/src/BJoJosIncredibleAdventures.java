import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJoJosIncredibleAdventures {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String s = br.readLine();
            long n = s.length();
            if (!s.contains("1")) {
                sb.append(0).append("\n");
                continue;
            }
            long maxLen = 0;
            long currentLen = 0;
            String doubled = s + s;
            for (int i = 0; i < doubled.length(); i++) {
                if (doubled.charAt(i) == '1') {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen);
                } else {
                    currentLen = 0;
                }
                if (maxLen >= n) break;
            }
            if (maxLen >= n) {
                sb.append(n * n).append("\n");
            } else {
                long x = (maxLen + 1) / 2;
                long y = (maxLen + 1) - x;
                sb.append(x * y).append("\n");
            }
        }
        System.out.print(sb);
    }
}