class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alpa = {"zero", "one", "two", "three", "four", "five", "six", 
                    "seven","eight", "nine"};
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        
        for(int i=0; i<=9; i++){
            
            s = s.replace(alpa[i], digits[i]);
        }
        System.out.print(s);
        answer = Integer.parseInt(s);
        
        return answer;
    }
}