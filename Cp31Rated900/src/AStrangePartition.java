import java.util.Scanner;

public class AStrangePartition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long[] a = new long[(int) n];
            long min = 0, max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                max += Math.ceil(a[i] * 1.0 / x);
                min += a[i];
            }
            min = (long) Math.ceil(min * 1.0 / x);
            System.out.println(min + " " + max);
        }
        scanner.close();
    }
}