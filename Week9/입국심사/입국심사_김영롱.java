package Week9.입국심사;

class 입국심사_김영롱 {
    public long solution(int n, int[] times) {
        long start = 0;
        long end = 1000000000 * 1000000000L;

        while (end > start) {
            long time = (start + end) / 2;
            long count = 0;

            for (int t : times) {
                count += time / t;
            }

            if (count >= n) {
                end = time;
            } else {
                start = time + 1;
            }
        }

        return end;
    }
}