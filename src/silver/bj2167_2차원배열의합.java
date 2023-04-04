package silver;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*문제
        2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.

        입력
        첫째 줄에 배열의 크기 N, M(1 ≤ N, M ≤ 300)이 주어진다. 다음 N개의 줄에는 M개의 정수로 배열이 주어진다. 배열에 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다. 그 다음 줄에는 합을 구할 부분의 개수 K(1 ≤ K ≤ 10,000)가 주어진다. 다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(1 ≤ i ≤ x ≤ N, 1 ≤ j ≤ y ≤ M).

        출력
        K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 2^31-1보다 작거나 같다.*/
public class bj2167_2차원배열의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
