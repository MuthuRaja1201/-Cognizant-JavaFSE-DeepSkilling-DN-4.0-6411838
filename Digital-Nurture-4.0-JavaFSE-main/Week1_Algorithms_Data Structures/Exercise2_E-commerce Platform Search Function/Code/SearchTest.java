

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Product(101, "Smartphone", "Electronics"),
            new Product(204, "Shoes", "Fashion"),
            new Product(305, "Laptop", "Electronics"),
            new Product(123, "Watch", "Accessories"),
            new Product(202, "Bag", "Fashion")
        };

        // Linear Search by productId
        System.out.println("Linear Search by Product ID:");
        Product result = SearchOperations.linearSearchById(products, 305);
        printResult(result);

        // Linear Search by productName
        System.out.println("\nLinear Search by Product Name:");
        Product resultByName = SearchOperations.linearSearchByName(products, "Bag");
        printResult(resultByName);

        // Linear Search by category
        System.out.println("\nLinear Search by Category:");
        Product resultByCategory = SearchOperations.linearSearchByCategory(products, "Electronics");
        printResult(resultByCategory);

        // Sort products before Binary Search
        SearchOperations.sortProductsById(products);

        // Binary Search by productId
        System.out.println("\nBinary Search by Product ID:");
        Product resultBinary = SearchOperations.binarySearchById(products, 204);
        printResult(resultBinary);
    }

    private static void printResult(Product product) {
        if (product != null) {
            System.out.println("Product Found: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }
}
