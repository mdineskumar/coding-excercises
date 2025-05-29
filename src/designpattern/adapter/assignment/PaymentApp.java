package designpattern.adapter.assignment;

public class PaymentApp {

    public void pay(int rupees){
        //PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        //paymentProcessor.pay();
        PaymentAdapter adapter = new PaymentAdapter();
        adapter.pay(rupees);

    }

    public static void main(String[] args) {
        PaymentApp paymentApp = new PaymentApp();
        paymentApp.pay(1000);
    }
}
