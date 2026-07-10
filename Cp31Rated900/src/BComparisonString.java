import java.util.Scanner;

public class BComparisonString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            String s = scanner.next();
            long longestSubstringLength = 1;
            long currentSubstringLength = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentSubstringLength++;
                } else {
                    longestSubstringLength = Math.max(longestSubstringLength, currentSubstringLength);
                    currentSubstringLength = 1;
                }
            }
            longestSubstringLength = Math.max(longestSubstringLength, currentSubstringLength);
            System.out.println(longestSubstringLength + 1);
        }
        scanner.close();
    }
}