package OOPSConcepts.Coupling.GoodExample;

public class OrderService {

    private PaymentProcessor paymentProcessor;

    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(double amount) {
        // Order processing logic
        System.out.println("Order placed successfully.");
        paymentProcessor.processPayment(amount);
    }
}
