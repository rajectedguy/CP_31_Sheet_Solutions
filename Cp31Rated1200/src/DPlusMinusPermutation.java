import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DPlusMinusPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long cntX = n / x;
            long cntY = n / y;
            long lcm = (x * y) / gcd(x, y);
            long cntLCM = n / lcm;
            cntX -= cntLCM;
            cntY -= cntLCM;
            long sumX = (cntX * (2 * n - cntX + 1)) / 2;
            long sumY = (cntY * (1 + cntY)) / 2;
            long maxScore = sumX - sumY;
            sb.append(maxScore).append("\n");
        }
        System.out.print(sb);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
