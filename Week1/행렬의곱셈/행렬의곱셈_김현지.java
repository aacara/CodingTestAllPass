package Week1.행렬의곱셈;

class 행렬의곱셈_김현지 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x1 = arr1.length;
        int y1 = arr1[0].length;
        int x2 = arr2.length;
        int y2 = arr2[0].length;

        
        int[][] answer = new int[x1][y2];
        int element;
        
        for (int i = 0 ; i < x1; i++) {
            for (int k = 0; k < y2; k++) {
                 element = 0;
                for (int j = 0; j < y1; j++) {
                    element += arr1[i][j] * arr2[j][k];
                }
                answer[i][k] = element;
            }
        }
        
        return answer;
    }
}