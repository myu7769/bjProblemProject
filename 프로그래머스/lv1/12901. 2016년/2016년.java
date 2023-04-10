class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int dayNum = b;
        
        for(int i=0; i<a - 1;i++){
            dayNum += month[i];            
        }
        
        answer = day[(dayNum-1)%7];        
        return answer;
    }
}