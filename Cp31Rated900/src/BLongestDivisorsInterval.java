import java.util.Scanner;

public class BLongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                long k = 1;
                while (n % k == 0) {
                    k++;
                }
                System.out.println(k - 1);
            }
        }
        sc.close();
    }
}