class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for(String ss : skip.split("")){
            alpha = alpha.replaceAll(ss,"");
        }        
        for (char i : s.toCharArray()) {
            int changeIndex = (alpha.indexOf(i) + index) % alpha.length(); 
            char change = alpha.charAt(changeIndex);
            answer.append(change);
        }
        return answer.toString();
    }
}