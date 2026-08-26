import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EBuildinganAquarium {
    private static boolean check(long mid, List<Long> heights, long x) {
        long units = 0;
        int n = heights.size();
        for (int i = 0; i < n; i++) {
            if (heights.get(i) < mid) {
                units += (mid - heights.get(i));
            }
        }
        return units <= x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            List<Long> heights = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                heights.add(scanner.nextLong());
            }
            long si = 1, ei = (long) 1e12, ans = -1;
            while (si <= ei) {
                long mid = si + (ei - si) / 2;
                if (check(mid, heights, x)) {
                    ans = mid;
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}