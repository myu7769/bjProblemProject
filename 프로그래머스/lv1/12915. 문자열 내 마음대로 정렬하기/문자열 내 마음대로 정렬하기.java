import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] o1ch = o1.toCharArray();
                char[] o2ch = o2.toCharArray();
                if(o1ch[n] == o2ch[n]){
                    return o1.compareTo(o2);
                }
                return o1ch[n]-o2ch[n];
            }
        });
        
        for(String s : strings){
            pq.offer(s);
        }
        
        for(int i = 0; i<strings.length; i++){    
            answer[i] = pq.poll();
        }
        
        return answer;
    }
}