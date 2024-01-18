import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        ArrayList<Long> counts = new ArrayList<>();
        Arrays.stream(info).forEach(str -> candidates.add(new Candidate(str)));

        for (String q : query) {
            long count = 0L;
            for (Candidate candidate : candidates) {
                if (candidate.getProgrammingLanguage().equals(q.split(" ")[0])
                        || q.split(
                        " ")[0].equals(
                        "-")) {
                    if (candidate.getProfession().equals(q.split(" ")[2])
                            || q.split(" ")[2].equals(
                            "-")) {
                        if (candidate.getCareerLevel().equals(q.split(" ")[4])
                                || q.split(" ")[4].equals(
                                "-")) {
                            if (candidate.getSoulFood().equals(q.split(" ")[6]) || q.split(
                                    " ")[6].equals(
                                    "-")) {
                                if (candidate.getTestScore() >= Integer.parseInt(q.split(" ")[7])
                                        || q.split(
                                        " ")[7].equals("-")) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            counts.add(count);
        }
        return counts.stream().mapToInt(Long::intValue).toArray();
    }

    public static class Candidate {
        private final String programmingLanguage;
        private final String profession;
        private final String careerLevel;
        private final String soulFood;
        private final Integer testScore;


        public Candidate(String input) {
            String[] splitInput = input.split(" ");
            this.programmingLanguage = splitInput[0];
            this.profession = splitInput[1];
            this.careerLevel = splitInput[2];
            this.soulFood = splitInput[3];
            this.testScore = Integer.parseInt(splitInput[4]);
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        public String getProfession() {
            return profession;
        }

        public String getCareerLevel() {
            return careerLevel;
        }

        public String getSoulFood() {
            return soulFood;
        }

        public Integer getTestScore() {
            return testScore;
        }
    }
}
