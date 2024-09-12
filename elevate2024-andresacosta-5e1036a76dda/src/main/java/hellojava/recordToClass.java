package hellojava;

import java.util.ArrayList;

public class recordToClass {

    public static void main(String[] args) {
        Products p1 = new Products("phone", 9.99, 3);
        Products p2 = new Products("car", 8.99, 2);
        Products p3 = new Products("plane", 5.99, 4);
        ArrayList<Products> names = new ArrayList<Products>();
        names.add(p1);
        names.add(p2);
        names.add(p3);
        printProduct(p1, p2, p3);
        printCost(names);


    }

    public static void printCost(ArrayList<Products> products) {
        double totalCost = 0.0;
        for (int i = 0; i < products.size(); i++) {
            Products currentProduct = products.get(i);

            // Calculate cost for this product and add to total
            double productCost = currentProduct.price() * currentProduct.quantity();
            totalCost += productCost;

            // Print individual product information (optional)
            System.out.println(currentProduct.name() + ": $" + productCost);
        }

        // Print the final total cost
        System.out.println("Total cost of all products: $" + totalCost);
    }


    public static void printProduct(Products p1, Products p2, Products p3) {
        System.out.println(p1.name() + " " + p1.price() + " " + p1.quantity());
        System.out.println(p2.name() + " " + p2.price() + " " + p2.quantity());
        System.out.println(p3.name() + " " + p3.price() + " " + p3.quantity());
    }

}

record Products(String name, double price, int quantity) {
}

