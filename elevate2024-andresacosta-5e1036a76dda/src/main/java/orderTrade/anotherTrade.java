package orderTrade;

import java.time.LocalDateTime;
import java.util.Objects;

public class anotherTrade implements Comparable <anotherTrade>{
    private String Symbol;
    private int Quantity;
    private double Price;
    private LocalDateTime dateTime;


    public anotherTrade(String symbol, int quantity, double price, LocalDateTime dateTime) {
        Symbol = symbol;
        Quantity = quantity;
        Price = price;
        this.dateTime = dateTime;
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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public int compareTo(anotherTrade again) {
        return this.dateTime.compareTo(again.dateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        anotherTrade that = (anotherTrade) o;
        return Quantity == that.Quantity && Double.compare(Price, that.Price) == 0 && Objects.equals(Symbol, that.Symbol) && Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Symbol, Quantity, Price, dateTime);
    }
}
