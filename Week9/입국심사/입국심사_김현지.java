import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

// 수의 범위 확인 -> long 조심
class 입국심사_김현지 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        return binarySearch(n, times);
    }
    
    private long binarySearch(int n, int[] times) {
        long left = 1;
        long right = (long)times[times.length - 1] * n;
        
        while (left < right) {
            long count = 0;
            long mid = (left + right) / 2;
            
            for (int time: times) {
                count += mid / time;
            }
            
            if (n <= count) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
