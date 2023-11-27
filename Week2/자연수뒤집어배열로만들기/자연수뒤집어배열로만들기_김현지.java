package Week2.자연수뒤집어배열로만들기;
import java.util.*;

class 자연수뒤집어배열로만들기_김현지 {
    public int[] solution(long n) {
        
        
        String s = Long.toString(n);
        int lenN = s.length();
        
        int[] answer = new int[lenN];
        
        for (int i = 0; i < lenN; i++) {
            answer[lenN - i - 1] = s.charAt(i) - '0';
        }
        return answer;
    }
}