package Week1.거리두기확인하기;


import java.util.*;

class 거리두기확인하기_김현지 {
    
    private static String[][] places;
    private static char[][] charPlaces;
    private static int row, col;
    private static int dx[] = {-1, 1, 0, 0};
    private static int dy[] = {0, 0, -1, 1};
    
    public int[] solution(String[][] places) {
        
        this.places = places;
        int numWaitingRoom = places.length;
        int[] answer = new int[numWaitingRoom];
        int keepDistance;
        

        row = places[0].length;
        col = places[0][0].length();
        
        for (int i = 0; i < numWaitingRoom; i++) {
            String[] place = places[i];
            charPlaces = new char[place.length][place[0].length()];
            for (int j = 0; j < col; j++) {
                charPlaces[j] = place[j].toCharArray();
            }
            keepDistance = checkKeepDistance();
            answer[i] = keepDistance;
        }
        
        return answer;
    }
    

    
    private static int checkKeepDistance() {
        int keepDistance = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (charPlaces[i][j] == 'P') {
                    keepDistance = moveOneStep(i, j);
                    if (keepDistance == 0) {
                        return 0;
                    }
                } 
            }
        }
        return keepDistance;
    }
    
    
    private static int moveOneStep(int x, int y) {
        int nx, ny;
        int keepDistance = 1;
        int comebackDirection = 0;
        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx < 0 || nx >= row || ny < 0 || ny >= col) {
                continue;
            }
            if (charPlaces[nx][ny] == 'P') {
                return 0;
            } else if (charPlaces[nx][ny] == 'X') {
                continue;
            } else if (charPlaces[nx][ny] == 'O') {
                if (i == 0) {
                    comebackDirection = 1;
                } else if (i == 1) {
                    comebackDirection = 0;
                } else if (i == 2) {
                    comebackDirection = 3;
                } else if (i == 3) {
                    comebackDirection = 2;
                }
                keepDistance = moveSecondStep(nx, ny, comebackDirection);
                if (keepDistance == 0) {
                    return 0;
                }
            }
        }
        return keepDistance;
    }
    
    private static int moveSecondStep(int nx, int ny, int comebackDirection) {
        int nnx, nny;
        int keepDistance = 1;
        for (int i = 0; i < 4; i++) {
            if (i == comebackDirection) {
                continue;
            }
            nnx = nx + dx[i];
            nny = ny + dy[i];
            if (nnx < 0 || nnx >= row || nny < 0 || nny >= col) {
                continue;
            } 
            if (charPlaces[nnx][nny] == 'P') {
                return 0;
            } 
        }
        return keepDistance;
    }
}