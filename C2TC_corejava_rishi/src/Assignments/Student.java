package Assignments;
import java.util.*;

public class Student {
	private String name;
    private int rollNo;
    private String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Department: " + department);

}

}
