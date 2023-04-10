class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cnt = 0;

        for(int i= 1; i<=count; i++){
            cnt = cnt + i;
        }
        System.out.println(cnt);
        
        long totalMoney = price * cnt;
        
        answer = money - totalMoney > 0 ? 0 : -(money - totalMoney);
        
        return answer;
    }
}