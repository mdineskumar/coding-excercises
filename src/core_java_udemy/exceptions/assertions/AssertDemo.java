package core_java_udemy.exceptions.assertions;

public class AssertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int withdrawalAmount = 100;
			int currentBalance = 60;
			
			assert (withdrawalAmount < currentBalance):"WITHDRAWAL AMOUNT > CURRENTBALANCE";
	}

}
