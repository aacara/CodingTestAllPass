package Week1.삼각달팽이;


class 삼각달팽이_김현지 {
    static int[][] stair;
    static int row;
    static int col;
    static int val;
    static int num;
    
    public int[] solution(int n) {
        num = n;
        val = 1;
        
        makeEmptyStair(n);
        fillStair(n);
        
        int[] answer = {};
        answer = combineStair(n, answer);
        return answer;
    }
    
    static void fillStair(int n) {
        row = -1;
        col = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                moveDown();
            } else if (i % 3 == 1) {
                moveRight();
            } else {
                moveLeftDiagonal();
            }
            num--;
        }
    }
    
    static void moveDown() {
        for (int i = 0; i < num; i++) {
            stair[++row][col] = val++;
        }
    }
    static void moveRight() {
        for (int i = 0; i < num; i++) {
            stair[row][++col] = val++;
        }
    }
    static void moveLeftDiagonal() {
        for (int i = 0; i < num; i++) {
            stair[--row][--col] = val++;
        }
    }
    
    
    static void makeEmptyStair(int n) {
        stair = new int[n][];
        for (int i = 0; i < n; i++) {
            stair[i] = new int[i+1];
        }
    }
    
    static int[] combineStair(int n, int[] answer) {
        int totalNum = n * (n + 1) / 2;
        answer = new int[totalNum];
        
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = stair[i][j];
            }
        }
        return answer;
    }
}
