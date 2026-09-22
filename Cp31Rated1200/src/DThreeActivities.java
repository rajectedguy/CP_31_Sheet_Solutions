import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DThreeActivities {
    static class Day implements Comparable<Day> {
        int val, id;

        Day(int val, int id) {
            this.val = val;
            this.id = id;
        }

        @Override
        public int compareTo(Day other) {
            return Integer.compare(other.val, this.val);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Day[] a = new Day[n];
            Day[] b = new Day[n];
            Day[] c = new Day[n];
            for (int i = 0; i < n; i++) a[i] = new Day(sc.nextInt(), i);
            for (int i = 0; i < n; i++) b[i] = new Day(sc.nextInt(), i);
            for (int i = 0; i < n; i++) c[i] = new Day(sc.nextInt(), i);
            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);
            long maxFriends = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (a[i].id != b[j].id && a[i].id != c[k].id && b[j].id != c[k].id) {
                            maxFriends = Math.max(maxFriends, (long) a[i].val + b[j].val + c[k].val);
                        }
                    }
                }
            }
            System.out.println(maxFriends);

        }
    }
}
