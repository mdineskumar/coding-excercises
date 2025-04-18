package algomaster_lld.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExampleWithInterfaces {
    interface  Teachable{
        void teach();
    }
    static class Professor implements Teachable{
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

    static class University {
        private String universityName;
        private List<Teachable> professors;

        public University(String name) {
            this.universityName = name;
            this.professors = new ArrayList<>();
        }

        public void addProfessor(Teachable professor) {
            this.professors.add(professor);
        }

        public void showProfessors() {
            System.out.println("Professors at: " + this.universityName);
            for (Teachable p : professors) {
                p.teach();
            }

        }
    }

    public static void main(String[] args) {
        Teachable p1 = new Professor("Dr. Pal","Biology");
        Teachable p2 = new Professor("Mr. Flips", "Maths");
        University mora = new University("UOM");
        mora.addProfessor(p1);
        mora.addProfessor(p2);
        mora.showProfessors();

    }


}

