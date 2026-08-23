import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BCollectingGame {
    static class Element implements Comparable<Element> {
        long val;
        int idx;

        Element(long val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Element o) {
            return Long.compare(this.val, o.val);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());

            Element[] arr = new Element[n];
            for (int i = 0; i < n; i++) {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                arr[i] = new Element(Long.parseLong(st.nextToken()), i);
            }

            Arrays.sort(arr);

            long[] pref = new long[n];
            pref[0] = arr[0].val;
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + arr[i].val;
            }

            int[] ans = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (j < i) {
                    j = i;
                }
                while (j + 1 < n && pref[j] >= arr[j + 1].val) {
                    j++;
                }
                ans[arr[i].idx] = j;
            }

            for (int i = 0; i < n; i++) {
                sb.append(ans[i]).append(i == n - 1 ? "" : " ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
