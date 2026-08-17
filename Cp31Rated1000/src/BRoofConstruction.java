import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BRoofConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            n--;
            long msb = (long) (Math.log(n) / Math.log(2));
            List<Long> ans = new ArrayList<>();
            long num = (long) Math.pow(2, msb) - 1;
            while (num >= 0) {
                ans.add(num);
                num--;
            }
            num = (long) Math.pow(2, msb);
            while (num <= n) {
                ans.add(num);
                num++;
            }
            for (long height : ans) {
                System.out.print(height + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}