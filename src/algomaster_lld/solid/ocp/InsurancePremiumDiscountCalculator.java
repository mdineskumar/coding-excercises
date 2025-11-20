package algomaster_lld.solid.ocp;

public class InsurancePremiumDiscountCalculator {
	
	public int calculatePremimumDiscountPercent(CustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}

}
