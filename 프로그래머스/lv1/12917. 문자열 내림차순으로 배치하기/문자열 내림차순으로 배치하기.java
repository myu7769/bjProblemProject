import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = s.toCharArray();        
        Arrays.sort(str);
        
        answer = new String(str);
        StringBuilder sb = new StringBuilder(answer);
        answer = sb.reverse().toString();
        
        return answer;
    }
}