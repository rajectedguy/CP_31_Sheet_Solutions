import java.util.Scanner;

public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            if (d < b) {
                System.out.println(-1);
                continue;
            }
            long diagonal = d - b;
            long xAfterDiagonal = a + diagonal;
            long left = xAfterDiagonal - c;
            if (left < 0) {
                System.out.println(-1);
            } else {
                System.out.println(diagonal + left);
            }
        }
        sc.close();
    }
}