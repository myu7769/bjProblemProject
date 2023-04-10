class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] bit = new int[100];
        int idx = 0;
        int cnt = 0;
        
        
        while(n != 0){
            bit[idx++] = n % 3;
            n /= 3;            
        }
        
        for(int i=idx - 1; i>=0; i--){            
            answer += bit[i] * Math.pow(3, cnt++);
        }
        
        return answer;
    }
}