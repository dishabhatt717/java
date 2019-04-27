package inheritance;

public class PreEmp extends Employee {
	float basic;
	float da;
	float hra;

	public PreEmp() {
	}

	public PreEmp(int id, String name, float basic) {
    super(id, name);
    this.basic = basic;
//    this.da =da;
//    this.hra =hra;
    
	}
	void CalcSalary() {
		da = basic*15/100;
		hra=basic*10/100;
		this.salary = basic + da + hra;
	}
	void print () {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}
}