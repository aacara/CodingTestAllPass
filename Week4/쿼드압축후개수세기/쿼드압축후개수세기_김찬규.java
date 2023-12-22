class Solution {
    int count0 = 0, count1 = 0;

    public int[] solution(int[][] arr) {
        divNConq(arr, 0, arr.length, 0, arr[0].length);
        return new int[]{count0, count1};
    }

    public void divNConq(int[][] arr, int x1, int x2, int y1, int y2) {
        int pivot = checkDiff(arr, x1, x2, y1, y2);
        if (pivot != -1) {
            if (pivot == 1) {
                count1++;
            } else {
                count0++;
            }
            return;
        }
        
        int midX = (x1 + x2) / 2;
        int midY = (y1 + y2) / 2;

        divNConq(arr, x1, midX, y1, midY);
        divNConq(arr, x1, midX, midY, y2);
        divNConq(arr, midX, x2, y1, midY);
        divNConq(arr, midX, x2, midY, y2);

    }

    public int checkDiff(int[][] arr, int x1, int x2, int y1, int y2) {
        int target = arr[x1][y1];
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (arr[i][j] != target) {
                    return -1;
                }
            }
        }
        return target;
    }
}
