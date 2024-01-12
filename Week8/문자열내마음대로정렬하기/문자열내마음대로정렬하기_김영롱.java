package Week8.문자열내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

class 문자열내마음대로정렬하기_김영롱 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                     .sorted()
                     .sorted(Comparator.comparingInt(o -> o.charAt(n))).toArray(String[]::new);
    }
}