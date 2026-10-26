import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CStableGroups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        java.util.Arrays.sort(a);
        ArrayList<Long> gapsNeeded = new ArrayList<>();
        long initialGroups = 1;
        for (int i = 1; i < n; i++) {
            long diff = a[i] - a[i - 1];
            if (diff > x) {
                initialGroups++;
                long needed = (diff - 1) / x;
                gapsNeeded.add(needed);
            }
        }
        Collections.sort(gapsNeeded);
        for (long needed : gapsNeeded) {
            if (k >= needed) {
                k -= needed;
                initialGroups--;
            } else {
                break;
            }
        }
        System.out.println(initialGroups);
    }
}