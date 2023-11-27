package Week1.거리두기확인하기;


import java.util.*;

class 거리두기확인하기_김영롱 {
    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            char[][] place = new char[places[i].length][];
            for (int j = 0; j < places[i].length; j++) {
                place[j] =  places[i][j].toCharArray();
            }

            if (isDistanced(place)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }

    private boolean isDistanced(char[][] positions) {
        for (int y = 0; y < positions.length; y++) {
            for (int x = 0; x < positions[y].length; x++) {
                if (positions[y][x] != 'P') continue;
                if (!isDistanced(positions, y, x)) return false;
            }
        }

        return true;
    }

    private boolean isDistanced(char[][] positions, int y, int x) {
        for (int i = 0; i < dx.length; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= positions.length || nx < 0 || nx >= positions[ny].length) continue;
            switch (positions[ny][nx]) {
                case 'P': return false;
                case 'O':
                    if (isNextToP(positions, ny, nx, 3 - i)) return false;
                    break;
            }
        }

        return true;
    }

    private boolean isNextToP(char[][] positions, int y, int x, int e) {
        for (int i = 0; i < dx.length; i++) {
            if (i == e) continue;

            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= positions.length || nx < 0 || nx >= positions[ny].length) continue;
            if (positions[ny][nx] == 'P') return true;
        }

        return false;
    }
}