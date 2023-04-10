import java.util.*;
class Solution {
    public String solution(int[] food) {
        Deque<String> deque = new ArrayDeque<>();
        String answer = "";
        deque.addLast("0");
        for(int i= food.length - 1; i>0; i--){
            for(int j =0; j<food[i]/2; j++){
                deque.addFirst(""+i);
                deque.addLast(""+i);
            }
        }
        for(String str : deque){
            answer += str;
        }
    

        return answer;
    }
}