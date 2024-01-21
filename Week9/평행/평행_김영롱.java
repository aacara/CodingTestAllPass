package Week9.평행;

import java.util.Map;
import java.util.HashMap;

class 평행_김영롱 {
    public int solution(int[][] dots) {
        Map<Double, Integer> map = new HashMap<>();

        for(int i=0; i<dots.length-1; i++) {
            for(int j=i+1; j<dots.length; j++) {
                double slope = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                map.put(slope, map.getOrDefault(slope, 0) + 1);
            }
        }

        for(double key : map.keySet()) {
            if(map.get(key) > 1 && map.get(key) % 2 == 0) return 1;
        }

        return 0;
    }
}