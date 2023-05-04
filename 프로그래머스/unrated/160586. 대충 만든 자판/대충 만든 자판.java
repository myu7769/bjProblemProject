import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int idxAnswer = 0;
        HashMap<String,Integer> hs = new HashMap<>();
        
        for(String key : keymap){
            int idx = 1;
            for(String k : key.split("")){
                if(!hs.containsKey(k)){
                    hs.put(k,idx);
                }else{
                    hs.put(k,Math.min(hs.get(k),idx));
                }
                idx++;
            }            
        }
        for(String target : targets){
            for(String t : target.split("")){
                if(hs.containsKey(t)){
                    answer[idxAnswer] += hs.get(t);
                }else{
                    answer[idxAnswer] = -1;
                    break;
                }
            }
            idxAnswer++;
        }
        
        return answer;
    }
}