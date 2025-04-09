package algomaster_lld.polymorphism.payment_system;

public class Main {
    public static void main(String[] args) {
        Payment payment;
        payment = new CreditCardPayment();
        payment.pay(100.50);

        payment = new PaypalPayment();
        payment.pay(200.75);

    }

}

interface Payment{
    void pay(double amount);
}

class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+" using credit card");
    }
}

class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+" using paypal");
    }
}
