import java.util.Arrays;

class Solution {
   public int solution(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed()
                .sorted((o1, o2) -> o2 - o1)
                .toArray(Integer[]::new);
        int answer = 0;
        int n = arr.length;
        while (n > 0) {
            int count = n;
            for (Integer value : arr) {
                if (value >= n) {
                    count--;
                }
            }
            if (count <= 0) {
                answer = n;
                break;
            }
            n--;
        }
        return answer;
    }
}
