package inheritance;

public class ConsEmp extends Employee{
	float hrs;
	float rateperhr;
	
	public ConsEmp() {}
	public ConsEmp(int id , String name, float hrs,float rateperhr) {
		super(id , name);
		this.hrs = hrs;
		this.rateperhr =rateperhr;
		}
	void CalcSalary() {
		this.salary =  hrs*rateperhr;
	}
	void print () {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}

}
