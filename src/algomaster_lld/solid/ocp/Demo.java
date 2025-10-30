package algomaster_lld.solid.ocp;

public class Demo {

	public static void main(String[] args) {
		InsurancePremiumDiscountCalculator insurCalculator = new InsurancePremiumDiscountCalculator();
		
		int discount = insurCalculator.calculatePremimumDiscountPercent(new VehicleInsuranceCustomerProfile());
		int discount_health = insurCalculator.calculatePremimumDiscountPercent(new HealthInsuranceCustomerProfile());
		
		System.out.println("Customer discount is: "+discount);
		
		System.out.println("Customer2 discount is: "+discount_health);
		
		System.out.println("Home customer get discount of: "+insurCalculator.calculatePremimumDiscountPercent(new HomeInsuranceCustomerProfile()));
		
	}

}
