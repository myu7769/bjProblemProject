class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt == (long)sqrt){
            answer=  (long)(sqrt + 1) * (long)(sqrt + 1);
        }else{
            return -1;
        }
        
        return answer;
    }
}