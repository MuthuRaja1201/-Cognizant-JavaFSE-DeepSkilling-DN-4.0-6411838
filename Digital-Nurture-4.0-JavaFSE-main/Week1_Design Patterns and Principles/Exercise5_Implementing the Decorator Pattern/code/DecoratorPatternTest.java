public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic email notification
        Notifier notifier = new EmailNotifier();

        // Add SMS functionality
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack functionality
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification through all channels
        notifier.send("System maintenance scheduled at 10 PM.");
    }
}
