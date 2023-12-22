package Week4.하노이의탑;

import java.util.*;

class 하노이의탑_김현지 {
    static List<int[]> answer = new ArrayList<>();
    
    public int[][] solution(int n) {
        Hanoi(n, 1, 3);
        
        return answer.toArray(new int[answer.size()][]);
    }
    
    private void Hanoi(int n, int a, int c) {
        if (n == 1) {
            answer.add(new int[] {a, c});
            return;
        }
        Hanoi(n-1, a,  6-a-c);
        Hanoi(1, a, c);
        Hanoi(n-1, 6-a-c, c);
    }
}
