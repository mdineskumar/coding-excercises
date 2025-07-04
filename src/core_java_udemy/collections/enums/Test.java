package core_java_udemy.collections.enums;

public class Test {
    public static void main(String[] args) {
        PaymentType pt = PaymentType.CASH;
        System.out.println(pt);

        PaymentType[] values = PaymentType.values();
        for (PaymentType pt1 :
                values) {
            System.out.println(pt1);
            System.out.println(pt1.ordinal());

            System.out.println(pt1.getFee());
        }


    }
}
