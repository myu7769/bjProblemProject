package programmers.DP;

public class lesson_1843 {
    public static void main(String[] args) {
        lesson_1843.Solution s = new Solution();
        String[] arr = {"1", "-", "3", "+", "5", "-", "8"};
        System.out.println(s.solution(arr));
    }

    static class Solution {
        public int solution(String arr[]){
            int answer = -1;
            int[] num = new int[arr.length/2 + 1];
            String[] op = new String[arr.length/2];
            int cnt = 0;
            int pcnt = 0;

            for(int i=0; i<arr.length;i++){
                if(i % 2 == 0){
                    num[cnt++]= Integer.parseInt(arr[i]);
                }else{
                    op[pcnt++] = arr[i];
                }
            }

            return  answer;
        }
    }
}
