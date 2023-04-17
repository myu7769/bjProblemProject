class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] paint = new int[n+1];
        int reg = 0;
        
        for(int sec : section){
            if(reg >= n) break;
            
            if(reg == 0){
                reg += sec;
                reg += m - 1;
                answer++;
                continue;
            }            
            if(reg < sec){
                reg = sec;
                reg += m - 1;
                answer++;
            }else{
                reg = Math.max(reg,sec);
            }            
        }
        
        return answer;
    }
}