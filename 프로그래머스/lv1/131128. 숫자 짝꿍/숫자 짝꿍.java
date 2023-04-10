class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder("");
        int[] num1 = new int[10]; // 0 ~ 9 : 0
        int[] num2 = new int[10];
        int[] result = new int[10];
        boolean isZero = true;
        
        for(int i=0; i<X.length();i++){
           num1[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           num2[Y.charAt(i)-48] += 1;
        }
        for(int i =0; i<10; i++){
            result[i]= Math.min(num1[i],num2[i]);
        }
        for(int i = result.length-1; i>=0; i--){
            for(int j =0; j<result[i]; j++){
                sb.append(i);
                if(i>0) isZero = false;
            }
        }
        answer = sb.toString();
        
        if(answer.equals("")){
            answer = "-1";
        } else if(isZero == true){
            answer = "0";
        }
        return answer;
    }
}