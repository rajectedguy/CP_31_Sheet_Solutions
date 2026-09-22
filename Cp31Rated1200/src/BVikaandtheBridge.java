import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BVikaandtheBridge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            ArrayList<Integer>[] positions = new ArrayList[k + 1];
            for (int i = 1; i <= k; i++) {
                positions[i] = new ArrayList<>();
                positions[i].add(0);
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int color = Integer.parseInt(st.nextToken());
                positions[color].add(i);
            }
            for (int i = 1; i <= k; i++) {
                positions[i].add(n + 1);
            }
            int minMaxStep = Integer.MAX_VALUE;
            for (int color = 1; color <= k; color++) {
                ArrayList<Integer> pos = positions[color];
                if (pos.size() == 2) {
                    continue;
                }
                int maxGap = 0;
                int secondMaxGap = 0;
                for (int i = 1; i < pos.size(); i++) {
                    int gap = pos.get(i) - pos.get(i - 1) - 1;
                    if (gap > maxGap) {
                        secondMaxGap = maxGap;
                        maxGap = gap;
                    } else if (gap > secondMaxGap) {
                        secondMaxGap = gap;
                    }
                }
                int currentCandidate = Math.max(maxGap / 2, secondMaxGap);
                minMaxStep = Math.min(minMaxStep, currentCandidate);
            }
            sb.append(minMaxStep).append("\n");
        }
        System.out.print(sb);
    }
}