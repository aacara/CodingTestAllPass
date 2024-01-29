import java.util.*;

class 완주하지못한선수_김현지 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            if (!participantMap.containsKey(c)) {
                continue;
            }
            
            participantMap.put(c, participantMap.get(c) - 1);
            
            if (participantMap.get(c) == 0) {
                participantMap.remove(c);
            }
        }

        Set<String> participantSet = participantMap.keySet();
        Iterator<String> iterator = participantSet.iterator();
        
        String answer = iterator.next();
        
        
        return answer;
    }
}