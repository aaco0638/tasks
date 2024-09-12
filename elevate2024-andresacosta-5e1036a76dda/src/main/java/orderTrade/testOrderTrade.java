package orderTrade;

import java.time.LocalDateTime;
import java.util.*;

public class testOrderTrade {

    static Map<String, SortedSet<Order>> orders = new HashMap<>();
    private static String currentUser = "Guest";
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    switchUser(scanner);
                    break;
                case 2:
                    createOrder(scanner);
                    break;
                case 0:
                    System.out.println("Exiting menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println("\nOrder Menu (Current user: " + currentUser + ")");
        System.out.println("1. Switch User");
        System.out.println("2. Create New Order");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void switchUser(Scanner scanner) {
        System.out.print("Enter new user name: ");
        currentUser = scanner.nextLine();
        orders.putIfAbsent(currentUser, new TreeSet<>());
        System.out.println("User switched to: " + currentUser);
    }

    private static void createOrder(Scanner scanner) {
        System.out.println("\nEnter order details:");



        Order newOrder = new Order("AAPL", 5, 188, "jon", Order.Side.valueOf("Buy"));
        //rest of logic would go here.
        System.out.println("Order created successfully for " + newOrder);

    }





    }

