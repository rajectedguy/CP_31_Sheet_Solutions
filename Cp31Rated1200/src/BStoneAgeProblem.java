import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BStoneAgeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numElements = Integer.parseInt(st.nextToken());
        int numQueries = Integer.parseInt(st.nextToken());
        long[] a = new long[numElements + 1];
        int[] lastElementUpdateTime = new int[numElements + 1];
        long totalSum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= numElements; i++) {
            a[i] = Long.parseLong(st.nextToken());
            totalSum += a[i];
            lastElementUpdateTime[i] = 0;
        }
        long lastGlobalValue = -1;
        int lastGlobalTime = -1;
        for (int time = 1; time <= numQueries; time++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int i = Integer.parseInt(st.nextToken());
                long x = Long.parseLong(st.nextToken());
                long currentValue = (lastElementUpdateTime[i] < lastGlobalTime) ? lastGlobalValue : a[i];
                totalSum -= currentValue;
                totalSum += x;
                a[i] = x;
                lastElementUpdateTime[i] = time;
            } else {
                long x = Long.parseLong(st.nextToken());
                lastGlobalValue = x;
                lastGlobalTime = time;
                totalSum = x * numElements;
            }
            sb.append(totalSum).append("\n");
        }
        System.out.print(sb);
    }
}
