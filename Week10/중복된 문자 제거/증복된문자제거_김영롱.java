import java.util.*;

class 증복된문자제거_김영롱 {
    private String myString;

    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(answer));

        return String.join("", set);
    }
}