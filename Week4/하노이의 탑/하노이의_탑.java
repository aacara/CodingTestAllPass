import java.util.*;

class Solution {
    List<int[]> op;

    public int[][] solution(int n) {
        op = new ArrayList<>();
        move(n, 1, 2, 3);
        int[][] answer = new int[op.size()][];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = op.get(i);
        }
        return answer;
    }

    public void move(int n, int from, int way, int to) {
        if (n == 1) {
            op.add(new int[]{from, to});
            return;
        }
        move(n - 1, from, to, way); // n-1개의 링을 출발지에서 경유지로 이동
        move(1, from, way, to); // 한 개의 링을 출발지에서 최종목적지로 이동
        move(n - 1, way, from, to); // 옮겨놓은 n-1개의 링을 다시 경유지에서 경유지로 이동
    }
}
