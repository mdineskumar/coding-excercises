package core_java_udemy.abstraction.abstract_class;

public class FiveSeries extends BMW{

    @Override
    void acclerate() {
        System.out.println("inside FiveSeries accelerate method.");
    }

    @Override
    void brake() {
        System.out.println("inside FiveSeries brake method.");
    }
}
