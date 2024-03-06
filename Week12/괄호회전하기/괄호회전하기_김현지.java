package Week12.괄호회전하기;

import java.util.*;

class 괄호회전하기_김현지 {
    
    public int solution(String s) {
        int result = 0;
        int strLen = s.length();
        
        for (int i = 0; i < strLen; i++) {
            String processedS = s.substring(i, strLen) + s.substring(0, i);
            if (discriminate(processedS)) {
                result++;
            }
        }

        return result;
    }
    
    private boolean discriminate(String s) {
        Stack<Character> stack = new Stack<>();
        int strLen = s.length();
        
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == '[') {
                stack.add('[');
            }
            if (s.charAt(i) == '{') {
                stack.add('{');
            }
            if (s.charAt(i) == '(') {
                stack.add('(');
            }
            
            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}