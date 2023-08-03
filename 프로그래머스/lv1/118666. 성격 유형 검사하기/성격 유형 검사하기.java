import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        Map<String,Integer> map = new LinkedHashMap<>();
        
        map.put("R",0);
        map.put("T",0);
        map.put("F",0);
        map.put("C",0);
        map.put("M",0);
        map.put("J",0);
        map.put("A",0);
        map.put("N",0);
        
        
        for(int i=0; i< survey.length; i++){
            
            String[] c = survey[i].split("");
            if(choices[i] > 4){
                map.put(c[1], map.getOrDefault(c[1],0)+choices[i]-4);
            }else{
                map.put(c[0], map.getOrDefault(c[0],0)+4-choices[i]);
                
            }            
        }
        
        if(map.get("R") >= map.get("T")){
            sb.append("R");
        }else{
            sb.append("T");
        }
        
        if(map.get("C") >= map.get("F")){
            sb.append("C");
        }else{
            sb.append("F");
        }
        
        if(map.get("J") >= map.get("M")){
            sb.append("J");
        }else{
            sb.append("M");
        }
        
        if(map.get("A") >= map.get("N")){
            sb.append("A");
        }else{
            sb.append("N");
        }
        
        answer = sb.toString();
        return answer;
    }
}