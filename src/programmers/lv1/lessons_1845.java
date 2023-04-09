package programmers.lv1;
import java.util.*;


public class lessons_1845 {
    public static void main(String[] args) {
        lessons_1845.Solution s = new Solution();
        int[] arr = {3,3,3,2,2,4};
        System.out.println(s.solution(arr));
    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            Set<Integer> set = new TreeSet<>();

            for(int i=0; i<nums.length; i++){
                set.add(nums[i]);
            }

            if(set.size() >= nums.length / 2 ){
                answer = nums.length/2;
            }else{
                answer = set.size();
            }
            System.out.println(set);

            return answer;
        }
    }
}
