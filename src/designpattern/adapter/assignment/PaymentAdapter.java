package designpattern.adapter.assignment;

public class PaymentAdapter {

    private PaymentProcessor paymentProcessor;

    public PaymentAdapter(){
        paymentProcessor = new PaymentProcessorImpl();
    }

//    @Override
//    public void pay(int dollars) {
//        double conversionRate = 300;
//        int convertedAmount = (int) (rupees / conversionRate);
//
//        paymentProcessor.pay(convertedAmount);
//
//    }

    public void pay(int rupees){
        double conversionRate = 300;
        int convertedAmount = (int) (rupees / conversionRate);

        paymentProcessor.pay(convertedAmount);
    }
}
