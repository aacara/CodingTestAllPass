import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            answer[x] = IntStream.rangeClosed(i -1, j-1 )
                    .map(o -> array[o])
                    .sorted().toArray()[k - 1];
        }
        return answer;
    }
}
