package arrayofobj;

public class Employee {

	private int id ;
	private String name;
	private float salary;
	
	public Employee() {

	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() { // it return value , to get value
		return id;
	}

	public void setId(int id) {  // do not return value , it sets its own value
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
}
	
}
