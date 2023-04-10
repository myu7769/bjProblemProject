class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] lcAp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] hiAp = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(char c : s.toCharArray())
        {
            if(c >= 'a' && c <= 'z') {
                sb.append(lcAp[(c-'a'+n) % 26]);
                
            }else if(c >= 'A' && c <= 'Z'){
                sb.append(hiAp[(c-'A'+n) % 26]);
            }else{
                sb.append(c);
            }            
        }
        answer = sb.toString();
        
        return answer;
    }
}