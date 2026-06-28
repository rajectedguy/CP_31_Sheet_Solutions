import java.util.ArrayList;
import java.util.Scanner;

public class BSequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] b = new  int[n];
            ArrayList<Integer> ans = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            ans.add(b[0]);
            for (int i = 1; i < n; i++) {
                if (b[i] >= b[i-1]){
                    ans.add(b[i]);
                }else {
                    ans.add(b[i]);
                    ans.add(b[i]);
                }
            }
            System.out.println(ans.size());
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}