import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BANDSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int ans = -1;
            for (int i = 0; i < n; i++) {
                int p = Integer.parseInt(st.nextToken());
                if (p != i) {
                    if (ans == -1) {
                        ans = p;
                    } else {
                        ans &= p;
                    }
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}
