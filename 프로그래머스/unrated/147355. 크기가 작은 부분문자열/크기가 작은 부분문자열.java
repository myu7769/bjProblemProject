
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp;
        int cnt = 0;
        Long pInt;
        int tInt;

        int tLength = t.length();
        int pLength = p.length();
        
        pInt = Long.parseLong(p);
        
        for(int i=0; i <= tLength - pLength; i++){
            
            tmp = t.substring(i,pLength+i);
            if(pInt >= Long.parseLong(tmp)){
                cnt++;
            }
        }
        answer = cnt;
        
        
        return answer;
    }
}