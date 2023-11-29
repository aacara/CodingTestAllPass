import java.io.*;
import java.util.ArrayList;

class Solution {
    
    public int[] solution(long number) {
        ArrayList<Integer> answer = new ArrayList<>();
        while (number != 0) {
            int digit = (int) (number % 10);
            number /= 10;
            answer.add(digit);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
