class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        answer = answer + 1;        
        
        for(int i=2;i<=number;i++){
            int powercnt = 0;
             for(int j=1;j*j<=i;j++){
                 if(j*j == i){
                     powercnt++;
                     continue;
                 }
                 
                if(i%j==0){
                    powercnt+=2;
                }                   
            }
            if(powercnt>limit){
                answer+=power;
            }else{
                answer+=powercnt;
            }            
        }
        
        return answer;
    }
}