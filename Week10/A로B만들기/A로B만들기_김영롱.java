package Week10.A로B만들기;

import java.util.Arrays;

class A로B만들기_김영롱 {
    public int solution(String before, String after) {
        char[] cBefore = before.toCharArray();
        char[] cAfter = after.toCharArray();
        Arrays.sort(cBefore);
        Arrays.sort(cAfter);

        int answer = 1;
        for (int i = 0; i < cBefore.length; i++) {
            if (cBefore[i] != cAfter[i]) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}