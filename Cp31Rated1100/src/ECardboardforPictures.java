import java.util.Scanner;

public class ECardboardforPictures {
    private static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        long c = scanner.nextLong();
        long[] a = new long[(int) n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        long l = 1, r = 1000000000, ans = -1;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long sumAll = 0;
            for (int i = 0; i < n; ++i) {
                sumAll += (a[i] + 2 * mid) * (a[i] + 2 * mid);
                if (sumAll > c) break;
            }
            if (sumAll <= c) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}
