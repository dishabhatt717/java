package arrayofobj;

public class TestStarbucks {
	public static void main(String[] args) {

		Starbucks starbucks = new Starbucks("FC Road", 12);
		Starbucks.Coffee coffee = starbucks.new Coffee("Almond Coffee", 450);
		
		starbucks.printStarbucks();
		coffee.printCoffee();
		

	}


}
