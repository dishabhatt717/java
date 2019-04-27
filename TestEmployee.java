package inheritance;

public class TestEmployee {
	public static void main(String[] args) {

		PreEmp p = new PreEmp();
		p.id = 1;
		p.name = "disha";
		p.basic = 45000;

		PreEmp p1 = new PreEmp(1, "disha", 45000);
		p1.CalcSalary();
		p1.print();

		ConsEmp c = new ConsEmp();
		c.id = 1;
		c.name = "dish";
		c.hrs = 9;
		c.rateperhr = 450;

	  ConsEmp c1 = new ConsEmp(1,"dish",9,450);
	  c1.CalcSalary();
	  c1.print();
	}

}
