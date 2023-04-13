import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;        
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        
        
        for(int i=0;i<dartResult.length(); i++){
            char cur = dartResult.charAt(i);
            if(Character.isDigit(cur)){
                if( cur == '1' && Character.isDigit(dartResult.charAt(i+1))){
                    list.add(10);
                    i++;
                }else{
                    list.add(cur - '0');                
                }
                idx++;
            }else{
                if(cur == 'S'){
                    ;
                }else if( cur == 'D'){
                    int num = list.get(idx - 1);
                    num = num * num;
                    list.set(idx - 1, num);
                }else if( cur == 'T'){
                    int num = list.get(idx - 1);
                    num = num * num * num;
                    list.set(idx - 1, num);
                }else if(cur == '*' ){                    
                    list.set(idx - 1, list.get(idx - 1) * 2);
                    if(idx >= 2) list.set(idx - 2, list.get(idx - 2) * 2);
                }else if(cur == '#'){
                    list.set(idx - 1, -1 * list.get(idx - 1));
                }
            }
        }
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}