//package hellojava;
//
//import java.util.Objects;
//
//public final class Product {
//    private String name;
//    private double price;
//    private int quantity;
//
//    public Product(String name, double price, int quantity){
//
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//
//    }
//    public String name(){
//        return name;
//    }
//    public double price(){
//        return price;
//    }
//    public int quantity(){
//        return quantity;
//    }
//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Product product = (product) o;
//
//        return quantity == product.quantity && Objects.equals(name, product.name) &&
//                Objects.equals(price, product.price);
//    }
//    }
//
//@Override
//public int hashCode() {  // Overriding hashCode for consistent hashing
//    return Objects.hash(name, price, quantity);
//}
//
//@Override
//public String toString() {  // Overriding toString for meaningful representation
//    return "Product{" +
//            "name='" + name + '\'' +
//            ", price=" + price + '\' ' +
//            ", quantity=" + quantity + "}";
//}

