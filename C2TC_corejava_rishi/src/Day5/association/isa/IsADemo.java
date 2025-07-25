package Day5.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Rishi", 101, "ECE");
		Manager manager = new Manager("Ashwin", 201, "HR", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);

	}

}
