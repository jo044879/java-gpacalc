package gpacalc;

public class Major {

    String majorName;
    String majorCredit;
    double majorScore;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorCredit() {
        return majorCredit;
    }

    public void setMajorCredit(String majorCredit) {
        this.majorCredit = majorCredit;
    }

    public double getMajorScore() {
        return majorScore;
    }

    public void setMajorScore(double majorScore) {
        this.majorScore = majorScore;
    }

    public Major(String majorName, double majorScore, String majorCredit){
        this.majorName =majorName;
        this.majorCredit = majorCredit;
        this.majorScore = majorScore;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorName='" + majorName + '\'' +
                ", majorCredit='" + majorCredit + '\'' +
                ", majorScore=" + majorScore +
                '}';
    }

    public double MajorCreditToPoint(){
        if(this.majorCredit.equals("A+")) return 4.5;
        else if(this.majorCredit.equals("A0")) return 4.0;
        else if(this.majorCredit.equals("B+")) return 3.5;
        else if(this.majorCredit.equals("B0")) return 3.0;
        else if(this.majorCredit.equals("C+")) return 2.5;
        else if(this.majorCredit.equals("C0")) return 2.0;
        else if(this.majorCredit.equals("D+")) return 1.5;
        else if(this.majorCredit.equals("D0")) return 1.0;
        else return 0;

    }
}
