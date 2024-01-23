import java.util.*;

class 입국심사_김현지_메모리초과 {
    private List<Integer> possibleCases = new ArrayList<>();
    
    public long solution(int n, int[] times) {
        makePossibleTime(n, times);
        Collections.sort(possibleCases);
        
        return possibleCases.get(n-1);
    }
    
    private void makePossibleTime(int n, int[] times) {
        for (int i = 1; i <= n; i++) {
            for (int time : times) {
                possibleCases.add(time * i);
            }
        }
    }
}                                         