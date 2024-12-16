public class Product {
    int id;
    String name;
    double price;
    int count = 10;

    public Product(int id, String name, double price, int cnt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = cnt;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Count: " + count);
    }

    public void buyProduct()
    {
        count--;
    }







    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 750.00, 5);
        product.displayDetails();

        product.buyProduct();

        product.displayDetails();

    }
}
