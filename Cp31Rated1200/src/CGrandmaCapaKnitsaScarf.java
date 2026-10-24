import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CGrandmaCapaKnitsaScarf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            int minDeletions = Integer.MAX_VALUE;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int left = 0;
                int right = n - 1;
                int currentDeletions = 0;
                boolean possible = true;
                while (left < right) {
                    if (s.charAt(left) == s.charAt(right)) {
                        left++;
                        right--;
                    } else if (s.charAt(left) == ch) {
                        left++;
                        currentDeletions++;
                    } else if (s.charAt(right) == ch) {
                        right--;
                        currentDeletions++;
                    } else {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    minDeletions = Math.min(minDeletions, currentDeletions);
                }
            }
            if (minDeletions == Integer.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(minDeletions).append("\n");
            }
        }
        System.out.print(sb);
    }
}
