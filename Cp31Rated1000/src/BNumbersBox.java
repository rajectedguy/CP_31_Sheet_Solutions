import java.util.Scanner;

public class BNumbersBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextLong();
                }
            }
            long negatives = 0;
            long minimum = Long.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] < 0) {
                        negatives++;
                    }
                    minimum = Math.min(minimum, Math.abs(a[i][j]));
                    sum += Math.abs(a[i][j]);
                }
            }
            if (negatives % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 2 * minimum);
            }
        }
        scanner.close();
    }
}