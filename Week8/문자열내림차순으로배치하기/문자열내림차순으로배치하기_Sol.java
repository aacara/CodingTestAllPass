package Week8.문자열내림차순으로배치하기;

public class 문자열내림차순으로배치하기_Sol {
  public String solution(String s) {
    return s.chars()
            .boxed()
            .sorted((v1, v2) -> v2 - v1)
            .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
            .toString();
  }
}
