import java.util.Scanner;

public class CDoubleendedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            int n = A.length();
            int m = B.length();
            int lcs = 0;
            for (int len = 1; len <= Math.min(n, m); len++) {
                for (int i = 0; i + len <= n; i++) {
                    for (int j = 0; j + len <= m; j++) {
                        String extractA = A.substring(i, i + len);
                        String extractB = B.substring(j, j + len);
                        if (extractA.equals(extractB)) {
                            lcs = Math.max(lcs, len);
                        }
                    }
                }
            }
            int operations = n + m - 2 * lcs;
            System.out.println(operations);
        }
        scanner.close();
    }
}