package core_java_udemy.assertions;

public class AssertDemo {


    public static void main(String[] args) {
        int withdrawlAmount = 100;
        int currentBalance = 60;

//        try{
//
//        }catch (AssertionError){
//
//        }
        assert(withdrawlAmount < currentBalance):"Withdrawl amount is more than current balance";
    }
}
