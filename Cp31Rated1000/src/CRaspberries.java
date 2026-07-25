import java.util.Scanner;

public class CRaspberries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long ans = Integer.MAX_VALUE;
            long evenCount = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    evenCount++;
                }
                if (a[i] % k == 0) {
                    ans = 0;
                }
                ans = Math.min(ans, (k - a[i] % k));
            }
            if (k == 4) {
                if (evenCount >= 2) {
                    ans = Math.min(ans, 0L);
                } else if (evenCount == 1) {
                    ans = Math.min(ans, 1L);
                } else if (evenCount == 0) {
                    ans = Math.min(ans, 2L);
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}