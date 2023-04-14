import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<name.length;i++){
            hm.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for(String[] ph : photo){
            int sum = 0;
            for(String p : ph){
                if(hm.containsKey(p)){
                   sum += hm.get(p);
                }               
            }
            list.add(sum);
        }
         
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}