import java.util.Scanner;

public class AJohnnyandAncientComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long ra = a;
            long rb = b;
            while (ra % 2 == 0)
                ra /= 2;
            while (rb % 2 == 0)
                rb /= 2;

            if (ra != rb) {
                System.out.println(-1);
            } else {
                a /= ra;
                b /= rb;

                a = (long) (Math.log(a) / Math.log(2));
                b = (long) (Math.log(b) / Math.log(2));

                long ans = (long) Math.ceil(Math.abs(a - b) / 3.0);
                System.out.println(ans);
            }
        }
        scanner.close();
    }
}