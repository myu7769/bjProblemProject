package programmers;
import java.util.*;
/*문제 설명
        아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.

        12 = 5 + 5 + (5 / 5) + (5 / 5)
        12 = 55 / 5 + 5 / 5
        12 = (55 + 5) / 5

        5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
        이처럼 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.

        제한사항
        N은 1 이상 9 이하입니다.
        number는 1 이상 32,000 이하입니다.
        수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
        최솟값이 8보다 크면 -1을 return 합니다*/
public class lesson_42895 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 12));
    }

    static class Solution {

        public int solution(int N, int number) {
            int answer = 0;
            ArrayList<Set<Integer>> list = new ArrayList<>();

            for(int i=0;i<9; i++){
                list.add(new HashSet<>()); // 1~8번 사용하는 숫자들
            }

            list.get(1).add(N); // 1번 사용해 만들 수 있는 숫자는 N뿐

            for(int i=2; i<9; i++){
                Set<Integer> curSet = list.get(i);

                for (int j = 1; j <= i ; j++) {
                    Set<Integer> set1 = list.get(j);
                    Set<Integer> set2 = list.get(i - j);

                    for (int num1 : set1) {
                        for (int num2 : set2) {
                            curSet.add(num1 + num2);
                            curSet.add(num1 - num2);
                            curSet.add(num1 * num2);
                            if(num2 != 0){
                                curSet.add(num1 / num2);
                            }
                        }
                    }

                    curSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
                }

            }
            for (Set<Integer> sub : list) {
                if (sub.contains(number)) {
                    return list.indexOf(sub);
                }
            }
            return -1;
        }
    }
}
