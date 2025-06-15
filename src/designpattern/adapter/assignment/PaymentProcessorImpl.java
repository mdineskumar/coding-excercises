package designpattern.adapter.assignment;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void pay(int dollars) {
        System.out.println("Pay in dollars: "+dollars);
    }
}
