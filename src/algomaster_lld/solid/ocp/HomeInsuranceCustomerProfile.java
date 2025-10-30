package algomaster_lld.solid.ocp;

import java.util.Random;

public class HomeInsuranceCustomerProfile implements CustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

}
