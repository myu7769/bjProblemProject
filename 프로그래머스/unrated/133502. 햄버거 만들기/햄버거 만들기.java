import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient){
            if(i == 1 && stack.size() >= 3){
                int gogi = stack.pop();                
                if(gogi == 3){
                    int yachae = stack.pop();
                    if(yachae == 2){
                        int bbang = stack.pop();
                        if(bbang == 1){
                            answer++;
                            continue;
                        }
                        stack.push(bbang);
                    }                    
                    stack.push(yachae);
                }                
                stack.push(gogi);
            }
            stack.push(i);                     
        }      
        
        return answer;
    }
}