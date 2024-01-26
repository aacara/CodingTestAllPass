import java.util.HashMap;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> pps = new HashMap<>();
        
        for(String name : participant){
            pps.put(name, pps.getOrDefault(name, 0) +1);
        }
        
        for(String name : completion){
            pps.computeIfPresent(name, (k,v) -> v - 1);
        }
        
        String answer = "";
        
        for(Map.Entry entry : pps.entrySet()){
            if(!entry.getValue().equals(0)){
                answer = entry.getKey().toString();
                break;
            }
        }
        
        return answer;
    }
}
