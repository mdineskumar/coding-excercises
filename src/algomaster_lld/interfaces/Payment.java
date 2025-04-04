package algomaster_lld.interfaces;

interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid: "+amount+" using Credit card");
    }
}
class PaypalPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid: "+amount+" using paypal");
    }
}
