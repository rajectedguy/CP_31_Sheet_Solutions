import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DMatryoshkas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            TreeMap<Integer, Integer> counts = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int size = Integer.parseInt(st.nextToken());
                counts.put(size, counts.getOrDefault(size, 0) + 1);
            }
            int totalSets = 0;
            int prevSize = -1;
            int prevCount = 0;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int currSize = entry.getKey();
                int currCount = entry.getValue();
                if (currSize == prevSize + 1) {
                    if (currCount > prevCount) {
                        totalSets += (currCount - prevCount);
                    }
                } else {
                    totalSets += currCount;
                }
                prevSize = currSize;
                prevCount = currCount;
            }
            sb.append(totalSets).append("\n");
        }
        System.out.print(sb);
    }
}