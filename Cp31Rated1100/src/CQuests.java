import java.util.Scanner;

public class CQuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int maxi = 0;
            int sum = 0;
            int ans = 0;
            for (int i = 0; i < Math.min(n, k); i++) {
                sum += a[i];
                maxi = Math.max(maxi, b[i]);
                ans = Math.max(ans, sum + (k - (i + 1)) * maxi);
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}