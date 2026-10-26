import java.util.Scanner;

public class B1PalindromeGameeasyversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int zeroCount = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }

            if (zeroCount % 2 == 0 || zeroCount == 1) {
                System.out.println("BOB");
            } else {
                System.out.println("ALICE");
            }
        }
        sc.close();
    }
}
