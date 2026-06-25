import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ADoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : a) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            if (freq.size() > 2) {
                System.out.println("No");
            } else if (freq.size() == 1) {
                System.out.println("Yes");
            } else {
                int maxFreq = Collections.max(freq.values());
                if (maxFreq <= (n + 1) / 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}