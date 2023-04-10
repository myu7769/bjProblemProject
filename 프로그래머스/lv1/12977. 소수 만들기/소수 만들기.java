class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                for(int k=j+1; k<nums.length; k++){
                    int cur = nums[i] + nums[j]+nums[k];
                    boolean prime = true;
                    for(int z = 2; z < cur; z++){
                        
                        if(cur % z == 0){
                            prime = false;
                            break;
                        }
                    }
                   if(prime){
                       answer++;
                   }
                }
            }
        }

        return answer;
    }
}