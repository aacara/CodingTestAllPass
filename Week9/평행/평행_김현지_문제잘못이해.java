package Week9.평행;

import java.util.*;

// ab, ac, ad, bc, bd, cd가 아닌
// 4개의 점을 두 개씩 이었을 때를 뜻함
// ex) (ab, cd), (ac, bd), (ad, bc)
class Solution {
    public int 평행_김현지_문제잘못이해(int[][] dots) {
        
        if (isParallel(dots)) {
            return 1;
        }

        return 0;
    }
    
    private boolean isParallel(int[][] dots) {
        int dotLen = dots.length;
        Set<Double> slope = new HashSet<>();
        
        for (int i = 0; i < dotLen; i++) {
            for (int j = i + 1; j < dotLen; j++) {
                if ((dots[j][0] - dots[i][0]) == 0) {
                    continue;
                }
                slope.add((double)(dots[j][1] - dots[i][1])/(dots[j][0] - dots[i][0]));
            }
        }
        
        int total = dotLen * (dotLen - 1) / 2;
        
        if (slope.size() == total) {
            return false;
        }
        return true;
        
    }
}