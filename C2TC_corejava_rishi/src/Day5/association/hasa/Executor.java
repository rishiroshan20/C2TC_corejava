package Day5.association.hasa;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address("230, Teacher's Colony", "Ottampalayam", "Pondicherry", "605004");
		Person person = new Person("Rishi Roshan", address);
		person.displayInfo();

	}

}
