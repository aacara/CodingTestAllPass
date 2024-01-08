package Week8.문자열내림차순으로배치하기;

import java.util.*;

class 문자열내림차순으로배치하기_김현지 {
    public String solution(String s) {
        String[] sArr = s.split("");
        Arrays.sort(sArr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int sArrLen = sArr.length;
        for (int i = 0; i < sArrLen; i++) {
            sb.append(sArr[i]);
        }
        
        return sb.toString();
    }
}