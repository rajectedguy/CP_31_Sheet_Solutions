import java.util.Scanner;

public class BDifferenceofGCDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long[] result = new long[n + 1];
            boolean possible = true;
            for (int i = 1; i <= n; i++) {
                long nextMultiple = ((l + i - 1) / i) * i;

                if (nextMultiple <= r) {
                    result[i] = nextMultiple;
                } else {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("YES");
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    sb.append(result[i]).append(i == n ? "" : " ");
                }
                System.out.println(sb.toString());
            } else {
                System.out.println("NO");
            }
        }
    }
}
