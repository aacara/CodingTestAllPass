public class Programmers_입국심사 {
    //-- 심사대가 비어 있는지 아닌지를 직접적으로 추적하지 않고도 문제를 해결할 수 있게 해 줌 --//
    public long solution(int n, int[] times) {
        Arrays.sort(times); // 가장 빠른 심사관이 처음에 들어갈 수 있도록 정렬

        long left = times[0];
        long right = (long) times[times.length - 1] * n;
        long answer = Long.MAX_VALUE;
        //-- 각 단계에서 해당 "중간 시간" 동안 각 심사관이 얼마나 많은 사람들을 처리할 수 있는지를 계산 --//
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int t : times) {
                sum += mid / t;
            }
            //-- "중간 시간" 동안 처리할수 있는 총 사람의 수가 실제 사람 수보다 많거나 같으면 이 "중간 시간"은 유효한 후보 해답 --//
            if (sum >= n) {
                answer = Math.min(answer, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

}
