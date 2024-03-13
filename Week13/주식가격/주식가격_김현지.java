package Week13.주식가격;

import java.util.*;

class 주식가격_김현지 {
    public int[] solution(int[] prices) {
        int priceLen = prices.length;
        int[] answer = new int[priceLen];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < priceLen; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        
        // 끝까지 가격이 떨어지지 않은 원소들
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = priceLen - 1 - idx;
        }
        return answer;
    }
}
