public class AdapterPatternTest {
    public static void main(String[] args) {
        // PayPal payment
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(250.75);

        // Stripe payment
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(500.00);
    }
}
