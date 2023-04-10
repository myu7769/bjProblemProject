import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = 0;
        int minApple = k;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
        
        for(int sc : score){
            pq.offer(sc);
        }        
        while(!pq.isEmpty()){
            int cur = pq.poll();
            cnt++;
            minApple = Math.min(minApple, cur);
            if(cnt == m){
                cnt = 0;
                answer += minApple * m;
            }                       
        }
        
        
        
        return answer;
    }
}