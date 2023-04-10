import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = ""+n;
        int[] answer = new int[num.length()];
        int i = 0;
        
        // ArrayList<Long> list = new ArrayList<>();
        while(n!=0){     
            answer[i++] = (int)(n%10);
            // list.add(n%10);            
            n /= 10;
        }        
        // answer = list.stream().mapToInt(Long::intValue).toArray();
        
        return answer;
    }
}