package Assignment1;
import java.util.*;

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());
            products[i] = new Product(name, id, price);
        }

        System.out.println("\nProduct Details:");
        for (Product p : products) {
            p.display();
        }
        sc.close();

	}

}
