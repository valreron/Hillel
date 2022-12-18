package lesson12.Homework12.EX2;

public class Product {
    private final String productName;
    private final int count;

    public Product(String productName, int count) {
        this.productName = productName;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Product = " + productName +
                ", count = " + count;
    }

}
