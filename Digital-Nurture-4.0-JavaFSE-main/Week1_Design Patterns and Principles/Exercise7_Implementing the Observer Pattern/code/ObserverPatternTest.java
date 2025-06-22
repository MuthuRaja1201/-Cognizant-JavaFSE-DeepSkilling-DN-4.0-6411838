public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp("StocksMobile");
        Observer webApp = new WebApp("StocksWeb");

        // Register observers
        market.registerObserver(mobileApp);
        market.registerObserver(webApp);

        // Update stock price (observers get notified)
        market.setStock("INFY", 1455.75);
        System.out.println();

        // Update stock price again
        market.setStock("TCS", 3725.00);
        System.out.println();

        // Deregister one observer and test
        market.deregisterObserver(webApp);

        // Update stock price again
        market.setStock("WIPRO", 535.60);
    }
}
