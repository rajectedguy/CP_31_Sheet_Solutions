import java.util.Scanner;

public class BKillDemodogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod = 1000000007L;
        while (t-- > 0) {
            long n = sc.nextLong();
            long term1 = n % mod;
            long term2 = (n + 1) % mod;
            long term3 = (4 * n - 1) % mod;
            long ans = term1;
            ans = (ans * term2) % mod;
            ans = (ans * term3) % mod;
            ans = (ans * 337) % mod;
            System.out.println(ans);
        }
    }
}
