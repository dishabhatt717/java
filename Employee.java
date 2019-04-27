package inheritance;

public class Employee {
	int id;
	String name;
	float salary;

	public Employee() {
	}

	public  Employee (int id , String name) {
		this.id =id;
		this.name = name;
	}
	void print () {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}

	

	
}