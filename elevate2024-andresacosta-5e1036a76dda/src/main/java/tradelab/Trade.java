package tradelab;


public class Trade {
    private String ID;
    private String ticker;
    private int quantity;
    private double price;


    public Trade(String ID, String ticker, int quantity, double price) {

        this.ID = ID;
        this.ticker = ticker;
        this.quantity = quantity;
        this.price = price;

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }


    public Trade(String ID, String ticker, int quantity){
        this.ID =ID;
        this.ticker = ticker;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "trade{" + "ID" + ID + " " + ", ticker" + ticker + ", quantity" + quantity + ", price" + price + " }";
    }
    public void setPrice(double p){
        this.price = p;
    }
    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int q){
        this.quantity= q;
    }
    public int getQuantity(){
     return this.quantity;
    }
}
