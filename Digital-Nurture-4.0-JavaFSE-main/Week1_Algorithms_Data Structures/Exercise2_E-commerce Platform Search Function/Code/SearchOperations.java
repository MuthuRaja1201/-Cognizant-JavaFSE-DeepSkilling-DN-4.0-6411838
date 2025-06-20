

import java.util.Arrays;
import java.util.Comparator;

public class SearchOperations {

    // Linear Search by productId
    public static Product linearSearchById(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    // Linear Search by productName
    public static Product linearSearchByName(Product[] products, String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    // Linear Search by category (returns first match — you can adapt for list of matches)
    public static Product linearSearchByCategory(Product[] products, String category) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by productId (Array must be sorted by productId)
    public static Product binarySearchById(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Sort products by productId
    public static void sortProductsById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }
}
