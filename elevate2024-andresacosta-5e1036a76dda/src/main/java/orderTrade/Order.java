package orderTrade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order implements Comparable<Order> {
    //private final Object Status;
    private String Symbol;
    private int Quantity;
    private  LocalDateTime dateTime;
    private Status status;
    private Side side;
    private String currentUser;
    private int price;

    @Override
    public int compareTo(Order otherOrder) {
        return this.dateTime.compareTo(otherOrder.dateTime);
    }

    public enum Side {
        Buy, Sell;

    }


    public enum Status {
        Placed, PartiallyFilled, Filled, Cancelled;
    }

    public Order(String Symbol, int Quantity, int price, String currentUser, Side side) {
        this.Symbol = Symbol;
        this.Quantity = Quantity;
        this.price = price;
        this.side = side;
        this.currentUser = currentUser;
        this.status = Status.Placed;
        this.dateTime = LocalDateTime.now();
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Symbol='" + Symbol + '\'' +
                ", Quantity=" + Quantity +
                ", dateTime=" + dateTime +
                ", status=" + status +
                ", side=" + side +
                ", currentUser='" + currentUser + '\'' +
                ", price=" + price +
                '}';
    }
}





