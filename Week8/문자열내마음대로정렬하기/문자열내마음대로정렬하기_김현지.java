package Week8.문자열내마음대로정렬하기;

import java.util.*;

class 문자열내마음대로정렬하기_김현지 {
    public String[] solution(String[] strings, int n) {
        
        return sortStrings(strings, n);
    }
    
    private static String[] sortStrings(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char char1 = s1.charAt(n);
                char char2 = s2.charAt(n);
                
                if (char1 == char2) {
                    return s1.compareTo(s2);
                }
                
                return Character.compare(char1, char2);
            }
        });
        
        return strings;
    }
}