package algomaster_lld.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Pal","Biology");
        Professor p2 = new Professor("Mr. Flips", "Maths");
        University mora = new University("UOM");
        mora.addProfessor(p1);
        mora.addProfessor(p2);
        mora.showProfessors();

        p1.teach();
        p2.teach();
    }
}

class Professor{
    private String name;
    private String subject;
    public Professor(String name, String subject) {
        this.subject = subject;
        this.name = name;
    }

    public void teach(){
        System.out.println(this.name+" teaches "+this.subject);
    }

    public String getName(){
        return name;
    }

}

class University{
    private String universityName;
    private List<Professor> professors;

    public University(String name) {
        this.universityName = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void showProfessors(){
        System.out.println("Professors at: "+this.universityName);
        for(Professor p:professors){
            System.out.println(" - "+p.getName());
        }

    }

}