import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class DCoprime {
    private static int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] lastIndex = new int[1001];
            Arrays.fill(lastIndex, -1);
            for (int i = 1; i <= n; i++) {
                int val = sc.nextInt();
                lastIndex[val] = i;
            }
            List<Integer> presentValues = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                if (lastIndex[i] != -1) {
                    presentValues.add(i);
                }
            }
            int maxIndexSum = -1;
            for (int i = 0; i < presentValues.size(); i++) {
                for (int j = i; j < presentValues.size(); j++) {
                    int v1 = presentValues.get(i);
                    int v2 = presentValues.get(j);
                    if (gcd(v1, v2) == 1) {
                        maxIndexSum = Math.max(maxIndexSum, lastIndex[v1] + lastIndex[v2]);
                    }
                }
            }
            System.out.println(maxIndexSum);
        }
    }
}