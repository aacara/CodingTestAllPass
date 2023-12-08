package Week3.이진변환반복하기;

public class 이진변환반복하기_김영롱 {
    public int[] solution(String s) {
        int rmCount = 0;
        int idx = 0;
        String replaced = s;

        while (true) {
            if (replaced.equals("1")) {
                break;
            }

            int beforeLen = replaced.length();
            replaced = replaced.replace("0", "");
            int afterLen = replaced.length();
            replaced = Integer.toString(afterLen, 2);

            rmCount += beforeLen - afterLen;
            idx++;
        }

        return new int[] {idx, rmCount};
    }
}