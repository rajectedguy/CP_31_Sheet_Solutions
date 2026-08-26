import java.util.Scanner;

public class BTenzingandBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int currentKnowledge = 0;
            for (int i = 0; i < 3; i++) {
                int[] stack = new int[n];
                for (int j = 0; j < n; j++) {
                    stack[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    int v = stack[j];
                    if ((v | x) == x) {
                        currentKnowledge |= v;
                    } else {
                        break;
                    }
                }
            }
            if (currentKnowledge == x) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
