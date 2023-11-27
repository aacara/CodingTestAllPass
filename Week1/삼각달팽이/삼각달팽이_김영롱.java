package Week1.삼각달팽이;

class 삼각달팽이_김영롱 {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int[] dx = {0, 1, -1};
        int[] dy = {1, 0, -1};

        int num = 1;
        int x = 0;
        int y = 0;
        int idx = 0;

        while(true) {
            arr[y][x] = num++;
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (nx == n || ny == n || nx == -1 || ny == -1 || arr[ny][nx] != 0) {
                idx = (idx + 1) % 3;
                nx = x + dx[idx];
                ny = y + dy[idx];

                if (nx == n || ny == n || nx == -1 || ny == -1 || arr[ny][nx] != 0) break;
            }
            x = nx;
            y = ny;
        }

        int pos = 0;
        int[] answer = new int[num - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[pos++] = arr[i][j];
            }
        }

        return answer;
    }
}