class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int item : arr){
            
            answer += item;
        }
        
        
        return answer/arr.length;
    }
}