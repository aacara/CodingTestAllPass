package Week2.자연수뒤집어배열로만들기;

import java.util.Arrays;

class 자연수뒤집어배열로만들기_김영롱 {
    public int[] solution(long n) {
        String str = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] answer = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

        return answer;
    }
}