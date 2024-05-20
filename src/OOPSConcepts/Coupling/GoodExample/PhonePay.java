package OOPSConcepts.Coupling.GoodExample;

public class PhonePay implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Phone pay will do payment");
       }

}
