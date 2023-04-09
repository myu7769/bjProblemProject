package programmers.DP;

public class lesson_43105 {

    public static void main(String[] args) {
        lesson_43105.Solution s = new Solution();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(s.solution(triangle));
    }

    static class Solution {
        static int[][] dp;
        public int solution(int[][] triangle) {
            int answer = 0;
            int num = triangle[triangle.length - 1].length;
            dp = new int[num][num];
            int max = Integer.MIN_VALUE;

            for(int i = 0; i<num; i++){
                max = Math.max(triDp(triangle,triangle.length - 1, i, triangle.length - 1), max);
            }

            for (int i = 0; i <5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }

            return max;
        }
        public int triDp(int[][] triangle,int x,int y, int depth){

            if(depth == 0){
                return triangle[0][0];
            }

            if(dp[x][y] != 0){
                return dp[x][y];
            }

            int nextX = x >= 1 ? x-1 : 0;
            int nextY = y >= 1 ? y-1 : 0;
            if( y >= triangle[x].length - 1){
                y = triangle[x].length - 1;
            }

            if(y == 0){
                dp[x][y] = triDp(triangle,nextX,0,depth -1) + triangle[x][y];
            }else if(y == triangle[x].length -1){
                dp[x][y] = triDp(triangle,nextX,y,depth - 1) + triangle[x][y];
            }else{
                dp[x][y] = Math.max(triDp(triangle,nextX,nextY,depth -1),triDp(triangle,nextX,y,depth - 1)) + triangle[x][y];
            }

            return dp[x][y];
        }
    }
}
