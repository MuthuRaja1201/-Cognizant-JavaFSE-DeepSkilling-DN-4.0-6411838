public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product(101, "Smartphone", 50, 15999));
        manager.addProduct(new Product(102, "Laptop", 30, 48999));
        manager.addProduct(new Product(103, "Shoes", 100, 2999));

        // Display all products
        manager.displayInventory();

        // Update a product
        manager.updateProduct(102, 25, 46999);

        // Delete a product
        manager.deleteProduct(103);

        // Display updated inventory
        manager.displayInventory();
    }
}
