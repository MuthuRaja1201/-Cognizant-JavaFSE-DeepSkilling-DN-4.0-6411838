public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Muthuraja"));
        paymentContext.payAmount(2500.00);

        System.out.println();

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("muthuraja@example.com"));
        paymentContext.payAmount(1500.50);
    }
}
