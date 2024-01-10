package Week8.문자열내마음대로정렬하기;

import java.util.*;

public class 문자열내마음대로정렬하기_Sol {
  public String[] solution(String[] strings, int n) {
    Arrays.sort(strings, (s1, s2) -> {
       if (s1.charAt(n) != s2.charAt(n)) {
        return s1.charAt(n) - s2.charAt(n);
      }
      return s1.compareTo(s2);
    });

    return strings;
  }
}
