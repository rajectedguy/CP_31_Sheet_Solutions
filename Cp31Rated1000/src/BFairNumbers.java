import java.util.Scanner;

public class BFairNumbers {
    private static boolean isFair(long n) {
        long num = n;
        while (num != 0) {
            int x = (int) (num % 10);
            if (x != 0 && n % x != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            while (!isFair(n)) {
                n += 1;
            }
            System.out.println(n);
        }
        scanner.close();
    }
}