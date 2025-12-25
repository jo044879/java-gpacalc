package gpacalc;

public class Refinement {
    String refinementName;
    String refinementCredit;
    double refineScore;

    public String getRefinementName() {
        return refinementName;
    }

    public void setRefinementName(String refinementName) {
        this.refinementName = refinementName;
    }

    public String getRefinementCredit() {
        return refinementCredit;
    }

    public void setRefinementCredit(String refinementCredit) {
        this.refinementCredit = refinementCredit;
    }

    public double getRefineScore() {
        return refineScore;
    }

    public void setRefineScore(double refineScore) {
        this.refineScore = refineScore;
    }

    public Refinement(String refinementName, double refineScore, String refinementCredit){
        this.refinementName = refinementName;
        this.refinementCredit = refinementCredit;
        this.refineScore = refineScore;
    }

    @Override
    public String toString() {
        return "Refinement{" +
                "refinementName='" + refinementName + '\'' +
                ", refinementCredit='" + refinementCredit + '\'' +
                ", refineScore=" + refineScore +
                '}';
    }

    public double RefineCreditToPoint(){
        if(this.refinementCredit.equals("A+")) return 4.5;
        else if(this.refinementCredit.equals("A0")) return 4.0;
        else if(this.refinementCredit.equals("B+")) return 3.5;
        else if(this.refinementCredit.equals("B0")) return 3.0;
        else if(this.refinementCredit.equals("C+")) return 2.5;
        else if(this.refinementCredit.equals("C0")) return 2.0;
        else if(this.refinementCredit.equals("D+")) return 1.5;
        else if(this.refinementCredit.equals("D0")) return 1.0;
        else return 0;
    }
}
