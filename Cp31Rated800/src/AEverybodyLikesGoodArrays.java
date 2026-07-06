import java.util.Scanner;

public class AEverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long operationsCount = 0;
            for (int i = 0; i < n - 1; i++) {
                if ((a[i] % 2) == (a[i + 1] % 2)) {
                    operationsCount++;
                }
            }
            System.out.println(operationsCount);
        }
        scanner.close();
    }
}
