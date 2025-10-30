package algomaster_lld.solid.ocp;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements CustomerProfile {
	
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

}