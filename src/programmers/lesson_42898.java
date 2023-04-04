package programmers;

public class lesson_42898 {
    public static void main(String[] args) {
        lesson_42898.Solution s = new Solution();
        int[][] puddles = {{ 2, 2}};
        System.out.println(s.solution(4,3, puddles));
    }

    static class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int answer = 0;
            int[][] dp = new int[n+1][m+1];

            for(int[] puddle : puddles){
                dp[puddle[1]][puddle[0]] = -1;
            }

            dp[1][1] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (dp[i][j] == -1) {
                        dp[i][j] = 0;
                        continue;
                    }
                    dp[i][j] += (dp[i-1][j]+dp[i][j-1]) % 1000000007;
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }

            return dp[n][m];
        }
    }
}
