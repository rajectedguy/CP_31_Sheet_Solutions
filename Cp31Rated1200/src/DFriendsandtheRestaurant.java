import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DFriendsandtheRestaurant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] x = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                x[i] = Long.parseLong(st.nextToken());
            }
            long[] y = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                y[i] = Long.parseLong(st.nextToken());
            }
            long[] diff = new long[n];
            for (int i = 0; i < n; i++) {
                diff[i] = y[i] - x[i];
            }
            Arrays.sort(diff);
            int left = 0;
            int right = n - 1;
            int days = 0;
            while (left < right) {
                if (diff[left] + diff[right] >= 0) {
                    days++;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }
            sb.append(days).append("\n");
        }
        System.out.print(sb);
    }
}