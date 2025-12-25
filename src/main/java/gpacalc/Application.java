package gpacalc;

/*
먼저 class를 만들면 안돼
name 은 강의명
credit은 이수학점
score는 평점 (a, b, c등) 이다.

 */

import static camp.nextstep.edu.missionutils.Console.readLine;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        //TODO: 구현
        ArrayList<Major> majorsList = new ArrayList<>();
        ArrayList<Refinement> refinementsList = new ArrayList<>();

        System.out.println("전공 과목명과 이수학점, 평점을 입력해주세요(예시: 프로그래밍언어론-3-A+,소프트웨어공학-3-B+):");

        String inputMajor = readLine();
        String[] majorInput = inputMajor.split(",");

        for(String repet : majorInput){
            String[] majorsplit = repet.split("-");
            Major currentMajor = new Major(majorsplit[0],  Integer.parseInt(majorsplit[1]), majorsplit[2]);
            majorsList.add(currentMajor);
        }

        System.out.println("교양 과목명과 이수학점, 평점을 입력해주세요(예시: 선형대수학-3-C0,인간관계와자기성장-3-P):");
        String inputRefine = readLine();
        String[] refineInput = inputRefine.split(",");

        for(String repet : refineInput){
            String[] refinesplit = repet.split("-");
            Refinement currentRefine = new Refinement(refinesplit[0], Integer.parseInt(refinesplit[1]), refinesplit[2]);
            refinementsList.add(currentRefine);
        }
        //교양이랑 전공 따로따로 모아놔야함 getter로 가져와서 쓰면 될듯? list에 담아뒀잖아.
        //취득학점 만들기 전에 그냥 싹다 p np 거나 F 면 배제해야함.
        //f np 면 취득학점에서 제외. p np는 평점평균에서 제외
        for(Major major : majorsList){
            System.out.println("[전공] " + major.getMajorName() + ","
                    + major.getMajorScore() + ","
                    + major.getMajorCredit());
        }

        for (Refinement refine : refinementsList) {
        // [교양] 과목명,이수학점,평점
        System.out.println("[교양] " + refine.getRefineScore() + ","
                + refine.getRefineScore() + ","
                + refine.getRefinementCredit());
    }

        TotalScore(majorsList, refinementsList);// 전체 취득학점 추출함수
        TotalAverage(majorsList, refinementsList);
        MajorAverage(majorsList);

    }


    // 전체 취득학점 추출함수
    static void TotalScore(ArrayList<Major> m, ArrayList<Refinement> r){

        double totalScore = 0;

        for(Major major : m){
            String grade = major.getMajorCredit(); // 평점(A+, F 등)을 가져오는 getter가 있다고 가정
            if(!grade.equals("F") && !grade.equals("NP")){
                totalScore += major.getMajorScore();
            }
        }

        for(Refinement refine : r){
            String grade = refine.getRefinementCredit(); // 평점(A+, F 등)을 가져오는 getter가 있다고 가정
            if(!grade.equals("F") && !grade.equals("NP")){
                totalScore += refine.getRefineScore();
            }
        }

        System.out.println("<취득학점>");

        System.out.println(totalScore+"학점");



    }

    static void TotalAverage(ArrayList<Major> m, ArrayList<Refinement> r) {
        double totalGradePoints = 0;

        int gpaTargetCredits = 0;

        for (Major major : m) {
            String grade = major.getMajorCredit(); // A+, P, F 등

            if (!grade.equals("P") && !grade.equals("NP")) {
                totalGradePoints += major.getMajorScore() * major.MajorCreditToPoint();
                gpaTargetCredits += major.getMajorScore();
            }
        }

        for (Refinement refine : r) {
            String grade = refine.getRefinementCredit();
            if (!grade.equals("P") && !grade.equals("NP")) {
                totalGradePoints += refine.getRefineScore() * refine.RefineCreditToPoint();
                gpaTargetCredits += refine.getRefineScore();
            }
        }

            double totalAverage = totalGradePoints / gpaTargetCredits;
            System.out.printf("평균 평점: %.2f / 4.5\n", totalAverage);

    }
    static void MajorAverage(ArrayList<Major> m){
        double totalGradePoints = 0;

        int gpaTargetCredits = 0;

        for (Major major : m) {
            String grade = major.getMajorCredit(); // A+, P, F 등

            if (!grade.equals("P") && !grade.equals("NP")) {
                totalGradePoints += major.getMajorScore() * major.MajorCreditToPoint();
                gpaTargetCredits += major.getMajorScore();
            }
        }
        double totalAverage = totalGradePoints / gpaTargetCredits;
        System.out.printf("평균 평점: %.2f / 4.5\n", totalAverage);
    }


}


