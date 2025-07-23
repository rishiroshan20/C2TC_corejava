package Assignment1;
import java.util.*;

public class Product {
	private String name;
    private int id;
    private double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: " + price);
    }

}
