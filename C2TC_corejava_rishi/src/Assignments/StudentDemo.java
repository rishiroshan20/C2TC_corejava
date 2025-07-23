package Assignments;
import java.util.*;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int rollNo = Integer.parseInt(sc.nextLine());
            System.out.print("Department: ");
            String dept = sc.nextLine();
            students[i] = new Student(name, rollNo, dept);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }
	}

}
