package inheritanceLab;

import java.awt.*;

public class BankAccount {
    private double balance;
    private int accountID;

    public BankAccount(double balance, int accountID){
        this.balance = balance;
        this.accountID = accountID;

    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return this.balance;
    }

    public void setaccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getaccountID() {
        return this.accountID;
    }


    @Override
    public String toString() {
        return "Account ID is: " + getaccountID() + " and your balance is: " + getbalance();
    }
    public void draw(Graphics g){
        g.drawRect(150,150,200,90);
        g.drawString("Account number is: " + accountID, 160, 180);
        g.drawString("Balance is: " + balance, 160, 200);
    }

}
