class Solution {
    public int solution(String s) {
        int answer = 0;
        char ex = s.charAt(0);
        int samecnt = 1;
        int othercnt = 0;
        boolean check = true;
        for(int i =1; i<s.length(); i++){
            char c = s.charAt(i);
            check = true;
            
            if(ex == c){
                samecnt++;
            }else{
                othercnt++;
            }
            if(samecnt == othercnt){
                answer++;
                check = false;
                samecnt = 0;
                othercnt = 0;
                if(i+1 < s.length()){
                    ex = s.charAt(i+1);
                    continue;
                }                 
            }
            if(!check) ex = c;           
        }
        if(check) answer++;
        
        
        
        return answer;
    }
}