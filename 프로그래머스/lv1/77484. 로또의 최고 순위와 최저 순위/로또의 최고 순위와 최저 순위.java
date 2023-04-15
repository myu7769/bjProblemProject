import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int p1 = 5;
        int p2 = 5;
        int yungcnt = 0;
        int match = 0;
        for(int lotto : lottos){
            if(lotto == 0){
                yungcnt++;
            }
        }
        
        while(p1 >= 0 && p2 >= 0){

            if(lottos[p1] > win_nums[p2]){
                p1--;
            }else if(lottos[p1] < win_nums[p2]){
                p2--;
            }else{
                p1--;
                p2--;
                match++;
            }       
        }
        System.out.println(yungcnt + " " + match);
        answer[0] = 7 - Math.min(Math.max(match+yungcnt,1),6);
        answer[1] = 7 - Math.max(match,1);
        return answer;
    }
}