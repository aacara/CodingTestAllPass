import java.util.*;

public class 두개뽑아서더하기_Sol {
  public int[] solution(int[] numbers) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < i +_1; j < numbers.length; j++) {
        set.add(numbers[i] + numbers[j]);
      }
    }

    return set.stream().mapToInt(Integer::intValue).sorted().toArray();
  }
}
