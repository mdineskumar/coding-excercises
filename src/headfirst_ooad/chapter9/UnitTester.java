package headfirst_ooad.chapter9;


public class UnitTester {
    public static void printTestResult(boolean isPassed){
        if (isPassed) {
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed!");
        }

    }
    public static void testSetGetCommonProperty(Unit unit, String value, String exprectedValue){
        unit.setType(value);
        printTestResult(unit.getType().equals(exprectedValue));
    }

    public static void testSetGetUnitSpecificProperty(Unit unit,String property, Object value, Object expectedValue){
        unit.setProperty(property,value);
        printTestResult(unit.getProperty(property).equals(expectedValue));
    }

    public static void testUpdateUnitSpecificProperty(Unit unit,String property, Object value,Object expectedValue){
        unit.setProperty(property,value);

        printTestResult(unit.getProperty(property).equals(expectedValue));
    }

    public static void testNonExistentPropeerty(Unit unit,String property,Object expectedValue){
        printTestResult(unit.getProperty(property) == expectedValue);
    }

    public static void main(String[] args) {
        testSetGetCommonProperty(new Unit(1),"infantry","infantry");
        Unit unit = new Unit(2);
        testSetGetUnitSpecificProperty(unit,"hitPoints",25,25);
        testUpdateUnitSpecificProperty(unit,"hitPoints",15, 15);
        testNonExistentPropeerty(new Unit(3),"strength",null);
    }
}
