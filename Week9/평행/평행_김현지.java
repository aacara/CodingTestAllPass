package Week9.평행;

import java.util.*;

class 평행_김현지 {
    public int solution(int[][] dots) {
        int dotLen = dots.length;
        
        for (int i = 0; i < dotLen; i++) {
            for (int j = i + 1; j < dotLen; j++) {
                for (int k = 0; k < dotLen; k++) {
                    for (int l = k + 1; l < dotLen; l++) {
                        if (i == k || i == l || j == k || j == l) {
                            continue;
                        }
                        
                        int dx1 = dots[j][0] - dots[i][0];
                        int dy1 = dots[j][1] - dots[i][1];
                        int dx2 = dots[l][0] - dots[k][0];
                        int dy2 = dots[l][1] - dots[k][1];
                        
                        if (dx1 == 0 && dx2 == 0) {
                            return 1;
                        }
                        
                        if ((dx2 * dy1 - dx1 * dy2) == 0) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
