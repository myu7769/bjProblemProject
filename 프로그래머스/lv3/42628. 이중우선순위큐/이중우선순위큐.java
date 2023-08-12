import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minqueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxqueue = new PriorityQueue<>((x,y)-> y-x);
        
        for(String op : operations){
            String[] s = op.split(" ");
            int val = s[0].equals("I") ? Integer.parseInt(s[1]) : 0;

            if(s[0].equals("I")){
                minqueue.offer(val);
                maxqueue.offer(val);
            }
            if(s[0].equals("D") && s[1].equals("1") && !maxqueue.isEmpty()){
                int maxVal = maxqueue.poll();
                minqueue.remove(maxVal);
            }
            if(s[0].equals("D") && s[1].equals("-1") && !minqueue.isEmpty()){
                int minVal = minqueue.poll();
                maxqueue.remove(minVal);
            }
        }

        if(maxqueue.isEmpty() || minqueue.isEmpty()){
            return new int[] {0, 0}; // returning [0, 0] if both queues are empty
        }
        
        return new int[]{maxqueue.peek(),minqueue.peek()};
    }
}
