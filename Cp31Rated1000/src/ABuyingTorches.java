import java.util.Scanner;

public class ABuyingTorches {
    // Function to perform ceiling division of a by b
    private static long ceilDivision(long a, long b) {
        return (a + b - 1) / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();

            long sticksGainedPerTrade = x - 1;
            long sticksNeeded = k * y + k - 1;
            long trades = 0;
            trades += ceilDivision(sticksNeeded, sticksGainedPerTrade);
            trades += k;
            System.out.println(trades);
        }
        scanner.close();
    }
}