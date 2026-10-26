import java.util.Scanner;

public class BPrinzessinderVerurteilung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(solve(s));
        }
        sc.close();
    }

    private static String solve(String s) {
        for (char i = 'a'; i <= 'z'; i++) {
            String candidate = "" + i;
            if (!s.contains(candidate)) {
                return candidate;
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                String candidate = "" + i + j;
                if (!s.contains(candidate)) {
                    return candidate;
                }
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                for (char k = 'a'; k <= 'z'; k++) {
                    String candidate = "" + i + j + k;
                    if (!s.contains(candidate)) {
                        return candidate;
                    }
                }
            }
        }
        return "";
    }
}
