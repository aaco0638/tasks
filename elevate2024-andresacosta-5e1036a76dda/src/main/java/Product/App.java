package Product;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product("phone", 9.99, 3);
        Product p2 = new Product("car", 8.99, 2);
        Product p3 = new Product("plane", 5.99, 4);
        ArrayList<Product> names = new ArrayList<Product>();
        names.add(p1);
        names.add(p2);
        names.add(p3);

        p1.print();
        p2.print();
        p3.print();
        alterPrice(p2,10.99);
        p2.print();

    }

    public static void alterPrice(Product product, double desiredValue){

        double priceDifference = desiredValue - product.getPrice();
        product.setPrice(product.getPrice() + priceDifference);


    }
}
