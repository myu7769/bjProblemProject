import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] str = Long.toString(n).toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder(new String(str));
        sb.reverse();
        return Long.parseLong(sb.toString());
    }
}