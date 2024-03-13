package Week13.기능개발;

import java.util.*;
import java.lang.*;

class 기능개발_김현지 {
    public int[] solution(int[] progresses, int[] speeds) {
        int jobLen = progresses.length;
        int[] daysLeft = new int[jobLen];
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < jobLen; i++) {
            daysLeft[i] = (int)(Math.ceil((100 - progresses[i]) / (double)speeds[i]));
        }
        
        stack.push(0);
        for (int i = 0; i < jobLen; i++) {
            while (!stack.isEmpty() && daysLeft[i] > daysLeft[stack.peek()]) {
                queue.add(stack.pop());
                stack.push(i);
            }
        }
        queue.add(stack.pop());

        List<Integer> arrAnswer = new ArrayList<>();
        int start = 0;
        int pop = 0;
        int newStart = 0;
        queue.poll();
        while (!queue.isEmpty()) {
            pop = queue.poll();
            newStart = pop - start;
            start = pop;
            arrAnswer.add(newStart);
        }
        
        arrAnswer.add(jobLen - pop);
        
        int[] answer = arrAnswer.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}