import java.util.*;

// 가능한 모든 경우의 수를 저장
// 정렬
// n-1번째 수를 구하면된다고 생각했지만
// "모든" 경우의 수를 저장해야하기 때문에 메모리 낭비가 심함
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