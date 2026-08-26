import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2DTraveling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            int a = Integer.parseInt(firstLine[2]) - 1;
            int b = Integer.parseInt(firstLine[3]) - 1;
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                String[] coords = br.readLine().split(" ");
                x[i] = Long.parseLong(coords[0]);
                y[i] = Long.parseLong(coords[1]);
            }
            long directCost = Math.abs(x[a] - x[b]) + Math.abs(y[a] - y[b]);
            if (k == 0) {
                System.out.println(directCost);
                continue;
            }
            long minToA = 4_000_000_000L;
            long minToB = 4_000_000_000L;
            for (int i = 0; i < k; i++) {
                minToA = Math.min(minToA, Math.abs(x[a] - x[i]) + Math.abs(y[a] - y[i]));
                minToB = Math.min(minToB, Math.abs(x[b] - x[i]) + Math.abs(y[b] - y[i]));
            }
            long majorCityPath = minToA + minToB;
            System.out.println(Math.min(directCost, majorCityPath));
        }
    }
}