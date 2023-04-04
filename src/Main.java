import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();

            int[][] arr = new int[row + 1][col + 1];
            int[][] DP = new int[row + 1][col + 1];

            for(int i = 1; i < arr.length; i++){
                for (int j = 1; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                    DP[i][j] = DP[i - 1][j] + DP[i][j - 1] - DP[i - 1][j - 1] + arr[i][j];
                }
            }

            int cntResult = sc.nextInt();

            int sum = 0;
            for(int i = 0; i<cntResult; i++){
                sum = 0;
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                sum = DP[x2][y2] - DP[x2][y1 - 1] - DP[x1 - 1][y2] + DP[x1 - 1][y1 - 1];
                System.out.println(sum);
            }
        }
}
