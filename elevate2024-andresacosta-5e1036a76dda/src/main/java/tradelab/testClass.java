package tradelab;

import Product.Product;

import java.util.ArrayList;

import static tradelab.Account.addTrade;

public class testClass {

    public static void main(String[] args) {

            Trade t1 = new Trade("T1", "APPL", 100, 15.25);
            Trade t2 = new Trade("T2", "MSFT", 100, 30.00);

            Account a1 = new Account();
            Account a2 = new Account();
            System.out.println(t1);
            addTrade(t1,a1);
            addTrade(t2, a2);
            System.out.println(t2);
            System.out.println(a1.getTotalValue());
            System.out.println(a2.getTotalValue());
        }
}
