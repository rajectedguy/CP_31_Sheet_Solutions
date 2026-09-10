import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BAPerfectlyBalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            if (solve(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean solve(String s) {
        Set<Character> distinctChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            distinctChars.add(c);
        }

        int k = distinctChars.size();

        Set<Character> firstK = new HashSet<>();
        for (int i = 0; i < k; i++) {
            if (firstK.contains(s.charAt(i))) {
                return false;
            }
            firstK.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i % k)) {
                return false;
            }
        }

        return true;
    }
}
