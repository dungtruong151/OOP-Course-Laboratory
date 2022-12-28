import java.util.Scanner;

public class Test {
    public int n=0;
    public Item[] items = new Item[n];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test t = new Test();
        System.out.print("Enter number of items: ");
        t.n = input.nextInt();
        t.items = new Item[t.n];
        for (int i=0;i<t.n;i++) {
            System.out.print("Enter item ID: ");
            String ID = input.next();
            System.out.print("Enter item name: ");
            String name = input.next();
            System.out.print("Enter item price: ");
            double price = input.nextDouble();
            t.items[i] = new Item(ID, name, price);
        }
        Order o = new Order("1", t.items);
        System.out.println("Average cost: " + o.calculateAverageCost());
    }
}
