class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isWord = false;
        int cnt = 0;

        char[] sChar = s.toCharArray();

        for(char c : sChar){
            if(c == ' '){
                cnt = 0;                
            }else{
                if(cnt % 2 == 0){                    
                    c = String.valueOf(c).toUpperCase().toCharArray()[0];
                }else{
                    c = String.valueOf(c).toLowerCase().toCharArray()[0];
                }
                cnt++;                
            }
            sb.append(c);                              
        }       
        answer = sb.toString();        
        return answer;
    }
}