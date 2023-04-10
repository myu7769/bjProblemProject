class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();

        if(str.length == 4 || str.length == 6){

        }else{
            answer = false;
        }


        for(char c : str){
            if(!Character.isDigit(c)){
                answer = false;
                break;
            }

        }

        return answer;
    }
}