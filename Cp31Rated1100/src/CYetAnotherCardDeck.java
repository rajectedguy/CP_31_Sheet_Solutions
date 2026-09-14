import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CYetAnotherCardDeck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] pos = new int[51];
        Arrays.fill(pos, -1);
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int color = Integer.parseInt(st.nextToken());
            if (pos[color] == -1) {
                pos[color] = i;
            }
        }
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int queryColor = Integer.parseInt(st.nextToken());
            int currentPos = pos[queryColor];
            sb.append(currentPos).append(" ");
            for (int c = 1; c <= 50; c++) {
                if (pos[c] != -1 && pos[c] < currentPos) {
                    pos[c]++;
                }
            }
            pos[queryColor] = 1;
        }
        System.out.println(sb.toString().trim());
    }
}
