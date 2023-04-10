class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        
        for(int i=0; i< seoul.length; i++){            
            if("Kim".equals(seoul[i])){
                sb.append(i);
            }            
        }
        sb.append("에 있다");
        answer = sb.toString();
        return answer;
    }
}