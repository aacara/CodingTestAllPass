package Week8.가장큰수;

import java.util.Arrays;

class 가장큰수_김영롱 {
    public String solution(int[] numbers) {

        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }

        String answer = sb.toString();

        return answer.charAt(0) == '0' ? "0" : answer;
    }
}