class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = a > b ? a : b;
        long min = a > b ? b : a;
        
        answer = (max - min +1) * (max + min) /2;

//         for(int i = min; i<=max; i++ ){
            
//             answer += i;
//         }
        
        return answer;
    }
}