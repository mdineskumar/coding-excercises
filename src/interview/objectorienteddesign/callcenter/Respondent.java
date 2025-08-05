package interview.objectorienteddesign.callcenter;

public class Respondent extends Employee{

    public Respondent(String name, String jobTitle, int age, String address) {
        super(name, jobTitle, age, address);
    }
    public Respondent() {
        super();
        this.rank = Rank.RESPONDENT;
    }
}
