import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int idx = 0;
        
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length;j++){
               set.add(numbers[i] + numbers[j]);
            }         
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> ite = set.iterator();
        while(ite.hasNext()) {
            answer[idx++] = ite.next();
		}
        
        return answer;
    }
}