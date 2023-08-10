import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        Map<String, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (String term : terms) {
            String[] ter = term.split(" ");
            map.put(ter[0], ter[1]);
        }
        int num = 1;
        for (String pri : privacies) {
            String[] p = pri.split(" ");
            if (map.containsKey(p[1])) {
                if (validDay(today, p[0], map.get(p[1]))) {
                    list.add(num);
                }
            }
            num++;
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public boolean validDay(String today1, String past1, String value) {

        String[] past = past1.split("\\.");

        int past_year = Integer.parseInt(past[0]);
        int past_month = Integer.parseInt(past[1]) + Integer.parseInt(value);
        int past_day = Integer.parseInt(past[2]);

        int additionalYears = past_month / 12;
        int remainingMonths = past_month % 12;

        if (remainingMonths == 0) {
            additionalYears -= 1;
            remainingMonths = 12;
        }

        past_year += additionalYears;
        past_month = remainingMonths;

        if (past_day == 1) {
            past_day = 28;
            past_month -= 1;
            if (past_month == 0) {
                past_month = 12;
                past_year -= 1;
            }
        } else {
            past_day -= 1;
        }

        String[] today = today1.split("\\.");
        int today_year = Integer.parseInt(today[0]);
        int today_month = Integer.parseInt(today[1]);
        int today_day = Integer.parseInt(today[2]);

        if (past_year > today_year) {
            return false;
        }

        if (past_year == today_year && past_month > today_month) {
            return false;
        }

        if (past_year == today_year && past_month == today_month && past_day >= today_day) {
            return false;
        }
        return true;
    }
}
