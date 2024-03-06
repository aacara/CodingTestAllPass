package Week12.올바른괄호;

import java.util.*;

class 올바른괄호_김현지 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int strLen = s.length();
        
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() =='(') {
                    stack.pop();
                } else if (stack.peek() ==')') {
                    stack.add('(');
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}