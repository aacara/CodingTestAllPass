package Week9.순위검색;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 순위검색_김영롱 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        List<Applicant> applicants = Arrays.stream(info).map(i -> Applicant.makeApplicantInfo(i)).collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            String[] conditions = query[i].split(" and | ");
            answer[i] = (int) applicants.stream().filter(a -> a.isRightApplicant(conditions)).count();
        }

        return answer;
    }
}

class Applicant {
    private String devLang;
    private String jobTitle;
    private String career;
    private String soulFood;
    private int score;

    public Applicant(String devLang, String jobTitle, String career, String soulFood, int score) {
        this.devLang = devLang;
        this.jobTitle = jobTitle;
        this.career = career;
        this.soulFood = soulFood;
        this.score = score;
    }

    public static Applicant makeApplicantInfo(String info) {
        String[] infos = info.split(" ");
        return new Applicant(infos[0], infos[1], infos[2], infos[3], Integer.parseInt(infos[4]));
    }

    public boolean isRightApplicant(String[] condition) {
        if(!condition[0].equals("-") && !condition[0].equals(this.devLang)) return false;
        if(!condition[1].equals("-") && !condition[1].equals(this.jobTitle)) return false;
        if(!condition[2].equals("-") && !condition[2].equals(this.career)) return false;
        if(!condition[3].equals("-") && !condition[3].equals(this.soulFood)) return false;
        if(Integer.parseInt(condition[4]) > this.score) return false;

        return true;
    }
}