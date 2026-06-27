import java.util.Scanner;

public class CTargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int[][] ringScore = {
                {1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,1,1,1,1}
        };
        while (t-- > 0) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        total += ringScore[i][j];
                    }
                }
            }
            System.out.println(total);
        }
        sc.close();
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
 
        while (t-- > 0) {
            char[][] grid = new char[10][10];
 
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
 
            int totalPoints = 0;
 
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X') {
                        int distance = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        int points = distance + 1; // ring number = distance + 1
                        totalPoints += points;
                    }
                }
            }
 
            System.out.println(totalPoints);
        }
 
        sc.close(); */
    }
}