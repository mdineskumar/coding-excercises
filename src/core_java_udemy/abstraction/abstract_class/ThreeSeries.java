package core_java_udemy.abstraction.abstract_class;

public final class ThreeSeries extends BMW {

    @Override
    void acclerate() {
        System.out.println("inside ThreeSeries accelerate method.");
    }

    @Override
    void brake() {
        System.out.println("inside ThreeSeries brake method.");
    }

}
