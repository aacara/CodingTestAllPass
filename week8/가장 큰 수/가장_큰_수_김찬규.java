import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
   public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((o1, o2) -> {
                    int a = Integer.parseInt(o1 + o2);
                    int b = Integer.parseInt(o2 + o1);
                    return b - a;
                })
                .collect(Collectors.joining());
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
