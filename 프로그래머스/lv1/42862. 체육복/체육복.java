import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] result = new int[n+1];

        Arrays.fill(result,1);        
        Arrays.sort(reserve);
        for(int lo : lost){
            result[lo]--;
        }
        for(int i=0;i<reserve.length;i++){
            if(result[reserve[i]] == 0){
                result[reserve[i]]++;
                reserve[i] = n + 5;
            }   
        }        
        
        for(int re : reserve){
            if(re - 1 >= 0 && re-1 <=n && result[re-1] == 0){
                result[re-1]++;
            }else if(re + 1 <= n && result[re+1] ==0){
                result[re+1]++;
            }           
        }
        
        System.out.println(Arrays.toString(result));       
        
        for(int i=1; i<n+1; i++){
            answer += result[i];
        }
        
        
        return answer;
    }
}