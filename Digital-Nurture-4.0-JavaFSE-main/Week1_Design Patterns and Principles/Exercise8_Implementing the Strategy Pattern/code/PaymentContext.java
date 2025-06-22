public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute strategy
    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment method not selected.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
