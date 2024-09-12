package hellojava;

public class Shop {

    public static void main (String[] args) {
        InventoryItems waterItem = new InventoryItems ("Water", true,  true );
        InventoryItems colaItem = new InventoryItems ("Cola", true,  true );

        Sale waterSale = new Sale(waterItem, 2, 7,6 );
        Sale colaSale = new Sale(colaItem, 4, 11, 16 );

        System.out.println(waterSale);
        System.out.println(colaSale);

        if (colaSale.quantity() > 5 && colaSale.quantity() <= 10) {
            System.out.println("A 10% discount is applied");
        }
        else if (colaSale.quantity() > 10) {
            System.out.println("A 20% discount is applied");
        }
        else if (colaSale.quantity() >= 1 && colaSale.quantity() <= 5) {
            System.out.println("No discount for you.");
        }
        else {
            System.out.println("Error!");
        }

        if (waterSale.quantity() > 5 && waterSale.quantity() <= 9) {
            System.out.println("A 10% discount is applied");
        }
        else if (waterSale.quantity() > 10) {
            System.out.println("A 20% discount is applied");
        }
        else if (waterSale.quantity() >=1 && waterSale.quantity() <=5) {
            System.out.println("No discount for you.");
        } else {
            System.out.println("Error!");
        }
    }
}

record InventoryItems (String name, boolean stocked, boolean sold ) {}
record Sale (InventoryItems item , int price, int quantity, int totalcost ) {}