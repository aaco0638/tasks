package inheritanceLab;

public class testShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(12,3,"green", 12.2);
        Rectangle r1 = new Rectangle(11.2,14.2,"blue",15.5, 16.2);
        BankAccount b1 = new BankAccount(10.1,123);

        c1.toString();
        r1.toString();

        b1.toString();

        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(b1.toString());

    }
}
