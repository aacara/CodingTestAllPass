package Week10.A로B만들기;

import java.util.*;

class A로B만들기_김현지 {
    public int solution(String before, String after) {
        if (before.length() != after.length()) {
            return 0;
        }
        
        Map<Character, Integer> beforeMap = new HashMap<>();
        int beforeLen = before.length();
        
        for (int i = 0; i < beforeLen; i++) {
            char c = before.charAt(i);
            beforeMap.put(c, beforeMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < beforeLen; i++) {
            char c = after.charAt(i);
            if (!beforeMap.containsKey(c) || beforeMap.get(c) == 0) {
                return 0;
            }
            beforeMap.put(c, beforeMap.get(c) - 1);
        }

        return 1;
    }
}