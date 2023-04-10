import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1]; // 소수 여부를 저장할 배열
        Arrays.fill(isPrime, true); // 모든 수를 소수로 초기화

        // 0과 1은 소수가 아니므로 바로 체크
        isPrime[0] = false;
        isPrime[1] = false;

        // 에라토스테네스의 체 알고리즘 수행
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) { // i가 소수인 경우
                for (int j = i * 2; j <= n; j += i) { // i의 배수들을 모두 체크
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }
        
        
        return answer;
    }
}