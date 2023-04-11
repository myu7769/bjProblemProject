import java.util.*;
class Node {
        
        int stagecnt;
        Double fail;        
        public Node(int stagecnt, Double num1, Double num2){
            this.stagecnt = stagecnt;
            if(num1 != 0 && num2 != 0){
                this.fail = num1/num2;
            }else{
                this.fail = 0.0 ;
            }
            
        }       
        
}
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] dp = new double[N+2];
        double[] cnt = new double[N+2];
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> x.fail.equals(y.fail) ? x.stagecnt - y.stagecnt : y.fail.compareTo(x.fail)); // class Node 만들어서 정렬해서 넣기
        
        for(int stage : stages){
            dp[stage]++;        
        }
        cnt = dp.clone();
        for(int i=N+1;i>=2;i--){
            dp[i-1] += dp[i];
        }
         System.out.println(Arrays.toString(cnt));    
         System.out.println(Arrays.toString(dp));

        for(int i=1; i<=N; i++){
            pq.offer(new Node(i, cnt[i], dp[i]));
        }
        int idx = 0;
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            answer[idx++] = cur.stagecnt;
        }
        return answer;
    }

}