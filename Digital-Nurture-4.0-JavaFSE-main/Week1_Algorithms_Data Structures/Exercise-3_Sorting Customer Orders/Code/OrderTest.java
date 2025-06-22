public class OrderTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1001, "Raj", 5000),
            new Order(1002, "Divya", 7800),
            new Order(1003, "Kumar", 3000),
            new Order(1004, "Priya", 9200),
            new Order(1005, "Anil", 6600)
        };

        // Bubble Sort
        System.out.println("Orders sorted by totalPrice (Descending) using Bubble Sort:");
        OrderSorter.bubbleSort(orders);
        printOrders(orders);

        // Quick Sort
        System.out.println("\nOrders sorted by totalPrice (Descending) using Quick Sort:");
        // Re-initializing array for fresh sorting
        orders = new Order[]{
            new Order(1001, "Raj", 5000),
            new Order(1002, "Divya", 7800),
            new Order(1003, "Kumar", 3000),
            new Order(1004, "Priya", 9200),
            new Order(1005, "Anil", 6600)
        };
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
