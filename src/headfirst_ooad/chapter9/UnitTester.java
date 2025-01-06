package headfirst_ooad.chapter9;


import java.sql.SQLOutput;

public class UnitTester {
    public static void printTestResult(boolean isPassed){
        if (isPassed) {
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed!");
        }

    }
    public static void testType(Unit unit, String type, String expectedOutputType){
        System.out.println("\nTesting setting/getting the type property.");
        unit.setType(type);
        String outputType = unit.getType();
        if (outputType.equals(expectedOutputType)){
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed: "+outputType+" didn't match " + expectedOutputType);
        }
    }

    public static void testSpecificProperty(Unit unit,String propertyName, Object inputValue, Object expectedOutputValue){
        System.out.println("\nTesting setting/getting a unit-specific property.");
        unit.setProperty(propertyName,inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (outputValue.equals(expectedOutputValue)){
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed: "+outputValue+ " didn't match "+expectedOutputValue);
        }

    }

    public static void testUpdateSpecificProperty(Unit unit,String propertyName, Object inputValue,Object expectedOutputValue){
        System.out.println("\nTesting updating an existing property's value.");
        unit.setProperty(propertyName,inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if (outputValue.equals(expectedOutputValue)){
            System.out.println("Test passed.");
        }else{
            System.out.println("Test failed: "+outputValue+ " didn't match "+expectedOutputValue);
        }
    }

    public static void testNonExistentPropeerty(Unit unit,String propertyName,Object expectedOutputValue){
        System.out.println("\nTesting getting a non-existent property's value");
        Object outputValue = null;
        try{
            outputValue = unit.getProperty(propertyName);
        }catch (RuntimeException e){
            System.out.println("Test passed.");
            return;
        }
        System.out.println("Test failed: "+ outputValue + " didn't match "+ expectedOutputValue);
    }

    public static void main(String[] args) {
        Unit unit = new Unit(1000);
        testType(unit,"infantry","infantry");
        testSpecificProperty(unit,"hitPoints",25,25);
        testUpdateSpecificProperty(unit,"hitPoints",15, 15);
        testNonExistentPropeerty(new Unit(3),"strength",null);
    }
}
