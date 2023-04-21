class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int leftcnt = 0;
        int right = 12;
        int rightcnt = 0;
        
        for(int num : numbers){
            leftcnt = 0;
            rightcnt = 0;
            if( num == 1 || num == 4 || num == 7){
                sb.append("L");
                left = num;
            }else if(num == 3 || num == 6 || num == 9){
                sb.append("R");
                right = num;
            }else{
                if(num == 0){
                    num = 11;
                }
                leftcnt = Math.abs(num - left)/3 + Math.abs(num - left)%3;
                rightcnt = Math.abs(num - right)/3 + Math.abs(num - right)%3;                     if(leftcnt > rightcnt ){
                    sb.append("R");
                    right = num;
                }else if(leftcnt < rightcnt){
                    sb.append("L");
                    left = num;
                }else{
                    if("right".equals(hand)){
                        sb.append("R");
                        right = num;
                    }else{
                        sb.append("L");
                        left = num;
                    }
                }            
            }           
        }
        answer = sb.toString();
        
        return answer;
    }
}