package core_java_udemy.enhancedswitch;

public class Project {
    public static void main(String[] args) {
        String day = "Sunday";

        switch(day){
            case "Monday"-> System.out.println("8am");
            case "Saturday","Sunday" -> System.out.println("6am");
            default -> System.out.println("7am");
        }
        //switch as expression
        String result = "";

        result = switch(day){
            case "Monday"-> "8am";
            case "Saturday","Sunday" -> "6am";
            default -> "7am";
        };
        System.out.println(result);

        day = "Monday";

        result = switch(day){
            case "Monday": yield "8am";
            case "Saturday","Sunday" : yield "6am";
            default : yield "7am";
        };
        System.out.println(result);
    }
}
