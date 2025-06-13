package core_java_udemy.abstraction.abstract_class;

public class Test {
    public static void main(String[] args) {
        ThreeSeries threeSeries = new ThreeSeries();
        threeSeries.acclerate();
        threeSeries.commonFunc();

        FiveSeries fiveSeries = new FiveSeries();
        fiveSeries.acclerate();
        fiveSeries.commonFunc();

    }
}
