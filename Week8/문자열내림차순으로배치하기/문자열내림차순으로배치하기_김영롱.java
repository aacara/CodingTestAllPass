package Week8.문자열내림차순으로배치하기;

import java.util.Arrays;

class 문자열내림차순으로배치하기_김영롱 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        return new StringBuilder().append(charArr).reverse().toString();
    }
}