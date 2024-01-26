import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(List.of(my_string.split("")));
        String answer = "";
        for (Object o : lhs) {
            answer = answer.concat(String.valueOf(o));
        }
        return answer;
    }
}
