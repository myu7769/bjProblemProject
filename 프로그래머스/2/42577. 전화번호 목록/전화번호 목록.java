import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int num = 0;
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(String phone : phone_book){
            hm.put(phone , num++);          
            
        }
        
                // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (hm.containsKey(phone_book[i].substring(0, j)))
                    return false;
        
        return answer;
    }
}