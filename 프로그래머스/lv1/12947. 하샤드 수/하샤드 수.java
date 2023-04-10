class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int hasha = x;
        int sum = 0;
        
        while(x != 0){
            sum += x%10;
            x = x/10;            
        }
        if(hasha % sum !=0){
            answer = false;
        }
        
        return answer;
    }
}