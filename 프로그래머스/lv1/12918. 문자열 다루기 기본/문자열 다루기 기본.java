class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        return s.matches("\\d{4}|\\d{6}");
    }
}