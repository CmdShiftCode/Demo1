package OOPSConcepts.Coupling.GoodExample;

public class ClientGE {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PhonePay();
        OrderService orderService = new OrderService(paymentProcessor);
        orderService.placeOrder(100.0);
    }
}
