class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int pCnt = 0;
        int yCnt = 0;
        
        
        for(char c : str){
            if(c == 'p' || c == 'P'){
                pCnt++;
            }
            
            if(c == 'y' || c == 'Y'){
                yCnt++;
            }            
        }        
        if(pCnt != yCnt){
            answer = false;
        }
        
        if(pCnt == 0 && yCnt == 0){
            answer = true;
        }

        return answer;
    }
}