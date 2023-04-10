class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i< arr1.length; i++){
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            StringBuilder sb = new StringBuilder();
            if(s.length() != n){
                for(int j=0; j< n-s.length(); j++){
                    sb.append(" ");
                }
            }
                for(char c : s.toCharArray()){
                    if(c == '1'){
                        sb.append("#");
                    }else{
                        sb.append(" ");
                    }
                }
                answer[i] = sb.toString();
            }
        return answer;
    }
}