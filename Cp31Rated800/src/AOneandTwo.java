import java.util.Scanner;

public class AOneandTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int total2 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) {
                    total2++;
                }
            }

            if (total2 % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int need = total2 / 2;
            int count2 = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    count2++;
                }
                if (count2 == need) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}