class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        
        for(String bob : babbling){
            for(int i=0;i<words.length;i++){
                bob = bob.replace(words[i],i+"");
            }
            char ex = ' ';
            boolean check = true;
            for(char c : bob.toCharArray()){
                if(ex == c){
                    check = false;
                    break;
                }
                if(!Character.isDigit(c)){
                     check = false;
                    break;
                }
                ex = c;
            }
            if(check){
                answer++;
            }
        }
        
        
        return answer;
    }
}