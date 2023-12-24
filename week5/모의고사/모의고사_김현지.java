package week5.모의고사;

import java.util.*;

class 모의고사_김현지 {
    static int[] giveUp1 = new int[] {1, 2, 3, 4, 5};
    static int[] giveUp2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] giveUp3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    static int[] answers;
    static int[] nums = new int[3];
    
    public int[] solution(int[] answers) {
        this.answers = answers;
        List<Integer> answer = new ArrayList<Integer>();
        getScore();
        int maxScore = getHighestScore();
        for (int i = 0; i < 3; i++) {
            if (nums[i] == maxScore) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private void getScore() {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == giveUp1[i % 5]) {
                nums[0]++;
            }
            if (answers[i] == giveUp2[i % 8]) {
                nums[1]++;
            }
            if (answers[i] == giveUp3[i % 10]) {
                nums[2]++;
            }
        }
    }
    
    private int getHighestScore() {
        int max = Integer.MIN_VALUE;
        
        for (int num: nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}