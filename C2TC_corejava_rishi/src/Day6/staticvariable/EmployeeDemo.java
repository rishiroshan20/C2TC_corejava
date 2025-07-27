package Day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
				// string and int.
				System.out.println(Employee.companyName);
				Employee e = new Employee("Rishi", 34);
				System.out.println(e);
				
				// Similarly, create the second object of the class and pass the two arguments.
				e = new Employee("Ashwin", 31);
				System.out.println(e);

	}

}
