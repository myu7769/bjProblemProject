class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean capitalize = true; // 다음 문자를 대문자로 변환해야 하는지 여부를 나타내는 변수
        
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalize = true; // 공백을 만나면 다음 문자를 대문자로 변환해야 함
                sb.append(c); // 공백은 그대로 유지
            } else {
                if (capitalize) {
                    sb.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        
        return sb.toString();
    }
}
