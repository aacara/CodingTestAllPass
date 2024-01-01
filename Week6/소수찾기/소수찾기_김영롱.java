package Week6.소수찾기;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 소수찾기_김영롱 {
    public int solution(String numbers) {
        // 1. 조합가능한 중복없는 모든 경우 만들기
        Set<Integer> numberSet = new HashSet<>();
        permutation("", numbers, numberSet);

        int answer = 0;
        Iterator<Integer> iterator = numberSet.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();

            // 2. 소수 판별하기
            if(isPrimeNum(num)) {
                answer++;
            }
        }

        return answer;
    }

    private void permutation(String prefix, String leftStr, Set<Integer> set) {
        int len = leftStr.length();

        if (!prefix.isBlank()) {
            set.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < len; i++) {
            permutation(prefix + leftStr.charAt(i), leftStr.substring(0, i) + leftStr.substring(i + 1, len), set);
        }
    }

    private boolean isPrimeNum(int num) {
        if(num == 0 || num == 1) return false;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && num != i) {
                return false;
            }
        }

        return true;
    }
}
