package main.java.prototypePattern;

public class IntelligentStudent extends Student{
    private int iq;
    private int intelligentScore;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
        this.intelligentScore = student.intelligentScore;
    }

    @Override
    public IntelligentStudent clone() {
       return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIntelligentScore() {
        return intelligentScore;
    }

    public void setIntelligentScore(int intelligentScore) {
        this.intelligentScore = intelligentScore;
    }
}
