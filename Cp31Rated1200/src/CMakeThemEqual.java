import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CMakeThemEqual {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String s = br.readLine().trim();
            boolean allMatch = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != c) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                output.append("0\n");
                continue;
            }
            int singleOpIndex = -1;
            for (int i = n / 2; i < n; i++) {
                if (s.charAt(i) == c) {
                    singleOpIndex = i + 1;
                    break;
                }
            }
            if (singleOpIndex != -1) {
                output.append("1\n").append(singleOpIndex).append("\n");
            } else {
                output.append("2\n").append(n - 1).append(" ").append(n).append("\n");
            }
        }
        System.out.print(output);
    }
}