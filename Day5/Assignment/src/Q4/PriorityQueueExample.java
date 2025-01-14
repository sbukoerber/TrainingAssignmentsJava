package Q4;

import java.util.Comparator;
import java.util.PriorityQueue;

class Product {
    int productId;
    String productName;
    double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom Comparator
        PriorityQueue<Product> priorityQueue = new PriorityQueue<>(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                // Prioritize products based on their price in descending order
                return Double.compare(p2.productPrice, p1.productPrice);
            }
        });

        // Create and add 5 products to the PriorityQueue
        Product product1 = new Product(1, "Product A", 100.0);
        Product product2 = new Product(2, "Product B", 50.0);
        Product product3 = new Product(3, "Product C", 200.0);
        Product product4 = new Product(4, "Product D", 75.0);
        Product product5 = new Product(5, "Product E", 150.0);

        priorityQueue.add(product1);
        priorityQueue.add(product2);
        priorityQueue.add(product3);
        priorityQueue.add(product4);
        priorityQueue.add(product5);

        // Print the products in the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            Product product = priorityQueue.poll();
            System.out.println(product);
        }
    }
}
