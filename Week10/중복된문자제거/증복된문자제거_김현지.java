package Week10.중복된문자제거;

import java.util.*;

class 증복된문자제거_김현지 {
    private String myString;
    
    public String solution(String my_string) {
        this.myString = my_string;
        int strLen = myString.length();
        Set<Character> myStringSet = new LinkedHashSet<>();
        
        for (int i = 0; i < strLen; i++) {
            myStringSet.add(my_string.charAt(i));
        }
        String answer = "";
        
        Iterator<Character> iterator = myStringSet.iterator();
        while (iterator.hasNext()) {
            Character element = iterator.next();
            answer += element;
        }

        return answer;
    }
}
