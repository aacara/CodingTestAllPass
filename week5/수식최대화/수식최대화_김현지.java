package week5.수식최대화;

import java.util.*;

class 수식최대화_김현지 {
    static String expression;
    
    public long solution(String expression) {
        this.expression = expression;
        
        return setPriority();
    }
    
    private Long setPriority() {
        Long maxVal = Long.MIN_VALUE;
        
        String[][] priorities = {
            {"*", "+", "-"},
            {"*", "-", "+"},
            {"+", "*", "-"},
            {"+", "-", "*"},
            {"-", "*", "+"},
            {"-", "+", "*"}
        };

        for (String[] priority : priorities) {
            maxVal = Math.max(maxVal, getResult(priority));
        }
        
        return maxVal;
    }
    
    private Long getResult(String[] priority) {
        List<Object> tokens = tokenize();
        
        for (String op: priority) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(op)) {
                    Long a = Long.parseLong(tokens.get(i - 1).toString());
                    Long b = Long.parseLong(tokens.get(i + 1).toString());
                    Long result = 0L;
                    
                    switch(op) {
                        case "*":
                            result = a * b;
                            break;
                        case "+":
                            result = a + b;
                            break;
                        case "-":
                            result = a - b;
                            break;
                    }
                    
                    tokens.set(i-1, result);
                    tokens.remove(i);
                    tokens.remove(i);
                    i--;
                }
            }
        }
        
        return Math.abs(Long.parseLong(tokens.get(0).toString()));
    }
    
    private List<Object> tokenize() {
        List<Object> tokens = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(expression, "*|+|-", true);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if ("*".equals(token) || "+".equals(token) || "-".equals(token)) {
                tokens.add(token);
            } else {
                tokens.add(Long.parseLong(token));
            }
        }
        
        return tokens;
    }
}
