import java.util.Scanner;

public class DBlackandWhiteStripe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            String s = scanner.next();
            long[] prefix = new long[(int) n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + (s.charAt(i) == 'W' ? 1 : 0);
            }
            long minimumCells = Long.MAX_VALUE;
            for (int i = 0; i <= n - k; i++) {
                long diff = prefix[i + (int) k] - prefix[i];
                minimumCells = Math.min(minimumCells, diff);
            }
            System.out.println(minimumCells);
        }
        scanner.close();
    }
}