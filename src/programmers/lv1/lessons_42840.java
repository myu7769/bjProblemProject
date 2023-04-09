package programmers.lv1;
import java.util.*;


public class lessons_42840 {
    public static void main(String[] args) {
        lessons_42840.Solution s = new Solution();
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
    static class Solution {
        public int[] solution(int[] answers) {

            int[] stu1 = {1,2,3,4,5};
            int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;

            PriorityQueue<Student> queue = new PriorityQueue<>((x,y)->y.cnt == x.cnt ? x.name-y.name : y.cnt-x.cnt);
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<answers.length; i++){
                int cur = answers[i];

                if(cur == stu1[i%stu1.length]){
                    cnt1++;
                }
                if(cur == stu2[i%stu2.length]){
                    cnt2++;
                }
                if(cur == stu3[i%stu3.length]){
                    cnt3++;
                }
            }
            input(queue,new Student(1,cnt1));
            input(queue,new Student(2,cnt2));
            input(queue,new Student(3,cnt3));

            int idx = 0;
            int precnt  = 0;
            while(!queue.isEmpty()){
                Student cur = queue.poll();
                if(idx != 0 && cur.cnt != precnt){
                    break;
                }
                idx++;
                precnt = cur.cnt;
                list.add(cur.name);
            }

            return list.stream().mapToInt(i->i).toArray();
        }
        public void input(PriorityQueue<Student> queue, Student stu){
            if(stu.cnt != 0){
                queue.offer(stu);
            }
        }
        class Student {
            int name;
            int cnt;
            Student(int name,int cnt){
                this.name = name;
                this.cnt = cnt;
            }
        }
    }
}

