import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<score.length;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
            for(int j=0;j<=i;j++){
                pq.offer(score[j]);
            }
            min = Integer.MAX_VALUE;
            cnt = 0;
            while(cnt!=k && !pq.isEmpty()){
                int cur = pq.poll();                
                min = Math.min(min, cur);
                cnt++;
            }            
            answer[i] = min;    
        }
        
        return answer;
    }
}