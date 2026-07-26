import java.util.*;

public class AHelmetsinNightLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long p = scanner.nextLong();
            long[] a = new long[(int) n];
            long[] b = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }
            List<Pair> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                v.add(new Pair(b[i], a[i]));
            }
            Collections.sort(v, Comparator.comparingLong(pair -> pair.sharingCost));
            long minimumCost = p;
            long alreadyShared = 1;
            for (Pair pair : v) {
                long canBeShared = pair.maxShares;
                long sharingCost = pair.sharingCost;
                if (sharingCost >= p) {
                    break;
                }
                if (alreadyShared + canBeShared > n) {
                    minimumCost += (n - alreadyShared) * sharingCost;
                    alreadyShared = n;
                    break;
                } else {
                    minimumCost += canBeShared * sharingCost;
                    alreadyShared += canBeShared;
                }
            }
            minimumCost += (n - alreadyShared) * p;
            System.out.println(minimumCost);
        }
        scanner.close();
    }
    static class Pair {
        long sharingCost;
        long maxShares;
        Pair(long sharingCost, long maxShares) {
            this.sharingCost = sharingCost;
            this.maxShares = maxShares;
        }
    }
}