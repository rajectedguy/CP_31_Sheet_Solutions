import java.util.Scanner;

public class BDejaVu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long q = scanner.nextLong();

            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long[] x = new long[(int) q];
            for (int i = 0; i < q; i++) {
                x[i] = scanner.nextLong();
            }
            long prev = 31;
            for (int i = 0; i < q; i++) {
                if (x[i] >= prev) continue;
                long val = (long) Math.pow(2, x[i]);
                for (int j = 0; j < n; j++) {
                    if (a[j] % val == 0) {
                        a[j] += (val / 2);
                    }
                }
                prev = x[i];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
