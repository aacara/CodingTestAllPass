package Week13.다리를지나는트럭;

import java.util.*;

class 다리를지나는트럭_김현지 {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int truckCount = truckWeights.length;
        Queue<Integer> bridge = new LinkedList<>();
        int bridgeWeight = 0;
        int time = 0;

        for (int i = 0; i < bridgeLength; i++) {
            bridge.add(0);
        }
        
        int idx = 0;
        while (idx < truckCount) {
            time++;
            bridgeWeight -= bridge.poll();
            
            int truckWeight = truckWeights[idx];
            if (bridgeWeight + truckWeight <= weight) {
                bridge.add(truckWeight);
                bridgeWeight += truckWeight;
                idx++;
            } else {
                bridge.add(0);
            }
        }
        
        return time + bridgeLength;
    }
}
