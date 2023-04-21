import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int length = board.length - 1;
        int idx = 0;

        System.out.println("length" + length);
        Stack<Integer> stack = new Stack<>();  
        for(int move : moves){
            idx = 0;            
            while(board[idx][move-1] == 0 && idx < length){
                idx++;
            }            
            int cur = board[idx][move-1];
            board[idx][move-1] = 0;
            if(cur == 0){
                idx++;
            }
          
            if(idx > length){
                continue;
            }else if(stack.isEmpty() || stack.peek() != cur){
                stack.push(cur);
            }else if(stack.peek() == cur){
                stack.pop();
                answer += 2;
            }          
            
        }
        
        return answer;
    }
}