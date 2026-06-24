import java.util.Scanner;

public class ACoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int maxGap = 0;
            int total = 0;
            int current = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    current++;
                    total++;
                    maxGap = Math.max(maxGap, current);
                } else {
                    current = 0;
                }
            }
            if (maxGap >= 3){
                System.out.println(2);
            }else {
                System.out.println(total);
            }
        }
        sc.close();
    }
}

// LINK - https://codeforces.com/problemset/problem/1900/A