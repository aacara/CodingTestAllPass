import java.util.*;
import java.util.stream.*;

class 없는_숫자_더하기_김영롱 {
    public int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }
}