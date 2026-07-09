import java.util.Scanner;

public class BChemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            int odd = 0;
            for (int f : freq) {
                if ((f & 1) == 1) {
                    odd++;
                }
            }
            int need = Math.max(0, odd - 1);
            if (need <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}