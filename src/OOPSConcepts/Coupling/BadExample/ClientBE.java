package OOPSConcepts.Coupling.BadExample;

public class ClientBE {

    public static void main(String[] args) {
        OrderServiceBE orderServiceBE = new OrderServiceBE();
        orderServiceBE.processPayment(200.0);
    }
}
