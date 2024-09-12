package tradelab;

import java.util.ArrayList;

public class Account {
    private double totalValue;


    public Account(){

        this.totalValue = 0.0;
    }

    public double getTotalValue() {
        return this.totalValue;
    }

    // Setter
    public void setTotalValue(double newValue) {
        this.totalValue = newValue;
    }

    public static void addTrade(Trade t, Account account){
        double totalCostItem = t.getPrice() * t.getQuantity();
        account.setTotalValue(totalCostItem);
    }


}
