import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int dot : d){
            if(dot > budget){
                break;
            }
            budget -= dot;
            answer++;
        }        
        return answer;
    }
}