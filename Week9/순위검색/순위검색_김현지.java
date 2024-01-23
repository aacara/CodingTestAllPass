package Week9.순위검색;

import java.util.*;

class 순위검색_김현지 {
    private Map<String, List<Integer>> applicantMap = new HashMap<>();
    
    public int[] solution(String[] info, String[] query) {
        saveApplicantInfo(info);
        orderScore();
        int[] answer = processQuery(query);
        
        return answer;
    }
    
    private void saveApplicantInfo(String[] infos) {
        for (String info : infos) {
            String[] infoArr = info.split(" ");
            String[] languages = {infoArr[0], "-"};
            String[] positions = {infoArr[1], "-"};
            String[] experiences = {infoArr[2], "-"};
            String[] soulFoods = {infoArr[3], "-"};
            int score = Integer.parseInt(infoArr[4]);
            
            for (String language : languages) {
                for (String position : positions) {
                    for (String experience : experiences) {
                        for (String soulFood : soulFoods) {
                            String key = language + " " + position + " " + experience + " " + soulFood;
                            applicantMap.computeIfAbsent(key, k -> new ArrayList<>()).add(score);
                        }
                    }
                }
        }
        }
    }
    
    private void orderScore() {
        for (List<Integer> scores : applicantMap.values()) {
            Collections.sort(scores);
        }
    }
    
    private int[] processQuery(String[] queries) {
        int[] result = new int[queries.length];
        int i = 0;
        for (String query : queries) {
            String[] queryPart = query.replaceAll(" and ", " ").split(" ");
            String key = String.join(" ", Arrays.copyOfRange(queryPart, 0, 4));
            int score = Integer.parseInt(queryPart[4]);
            
            List<Integer> scores = applicantMap.getOrDefault(key, new ArrayList<>());
            int count = binarySearch(score, scores);
            result[i++] = count;
        }
        
        return result;
    }
    
    private int binarySearch(int score, List<Integer> scores) {
        int count = 0;
        int left = 0;
        int right = scores.size();
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (scores.get(mid) >= score) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        count = scores.size() - left;
        
        return count;
    }
}