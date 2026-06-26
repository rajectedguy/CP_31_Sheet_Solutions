import java.util.Scanner;

public class ADontTrytoCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(x);
            boolean found = false;
            for (int i = 0; i <= 10; i++) {
                if (sb.indexOf(s) != -1) {
                    System.out.println(i);
                    found = true;
                    break;
                }
                sb.append(sb.toString());
            }
            if (!found) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}