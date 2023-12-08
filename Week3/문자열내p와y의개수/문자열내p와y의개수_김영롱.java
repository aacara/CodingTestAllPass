package Week3.문자열내p와y의개수;

import java.util.HashMap;
import java.util.Map;

public class 문자열내p와y의개수_김영롱 {
    boolean solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('P', 0);
        map.put('Y', 0);

        for (char c : s.toCharArray()) {
            char upperChar = Character.toUpperCase(c);

            if (upperChar == 'P' || upperChar == 'Y') {
                map.put(upperChar, map.get(upperChar) + 1);
            }
        }

        return map.get('P') == map.get('Y') ? true : false;
    }
}