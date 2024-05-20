package OOPSConcepts.Coupling.GoodExample;

public class GooglePay implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Google pay will process this payment");
      }

}
