package OOPSConcepts.Coupling.BadExample;

public class OrderServiceBE {

    private PaytmPayment paymentProcessor;

    public OrderServiceBE()
    {
        paymentProcessor = new PaytmPayment();
    }

    public void processPayment(double amount)
    {
        paymentProcessor.processPayment(amount);
    }
}
