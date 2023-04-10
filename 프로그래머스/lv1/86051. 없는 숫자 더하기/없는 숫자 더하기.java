class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int num45 = 45;
        for(int num : numbers){
            num45 = num45 - num;
        }
        answer = num45;
        return answer;
    }
}