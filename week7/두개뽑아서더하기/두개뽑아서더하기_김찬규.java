import java.util.*;

class Solution {
    HashSet<Integer> map = new HashSet<>();
    
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(i!=j){
                    map.add(numbers[i] + numbers[j]);
                }
            }
        }
        List<Integer> list = new ArrayList<>(map);

        return list.stream().sorted()
                   .mapToInt(Integer::intValue).toArray();
    }
}
