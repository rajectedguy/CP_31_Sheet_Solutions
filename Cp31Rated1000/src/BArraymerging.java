import java.util.Scanner;

public class BArraymerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long[] b = new long[(int) n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }
            long[] longestSubarrayA = new long[(int) (2 * n + 1)];
            long[] longestSubarrayB = new long[(int) (2 * n + 1)];
            long counter = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    counter++;
                } else {
                    longestSubarrayA[(int) a[i - 1]] = Math.max(longestSubarrayA[(int) a[i - 1]], counter);
                    counter = 1;
                }
            }
            longestSubarrayA[(int) a[(int) (n - 1)]] = Math.max(longestSubarrayA[(int) a[(int) (n - 1)]], counter);
            counter = 1;
            for (int i = 1; i < n; i++) {
                if (b[i] == b[i - 1]) {
                    counter++;
                } else {
                    longestSubarrayB[(int) b[i - 1]] = Math.max(longestSubarrayB[(int) b[i - 1]], counter);
                    counter = 1;
                }
            }
            longestSubarrayB[(int) b[(int) (n - 1)]] = Math.max(longestSubarrayB[(int) b[(int) (n - 1)]], counter);
            long maxFreq = -1;
            for (int i = 1; i <= 2 * n; i++) {
                maxFreq = Math.max(maxFreq, longestSubarrayA[i] + longestSubarrayB[i]);
            }
            System.out.println(maxFreq);
        }
        scanner.close();
    }
}