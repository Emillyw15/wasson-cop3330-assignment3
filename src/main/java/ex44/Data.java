package ex44;

public class Data {
    Product[] products;

    public boolean search(String name) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].name.equals(name)) {
                System.out.println("Name: " + products[i].name);
                System.out.println("Price: " + products[i].price);
                System.out.println("Quantity: " + products[i].quantity);
                return true;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}

class Product {
    String name;
    double price;
    int quantity;
}
