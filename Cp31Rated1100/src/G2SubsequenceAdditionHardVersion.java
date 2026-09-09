import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G2SubsequenceAdditionHardVersion {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] c = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextLong();
            }
            Arrays.sort(c);
            if (c[0] != 1) {
                out.println("NO");
                continue;
            }
            long currentSum = 1;
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (c[i] > currentSum) {
                    possible = false;
                    break;
                }
                currentSum += c[i];
            }
            if (possible) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;
        Scanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
