package inheritance;

public class Test {
	public static void main(String[] args) {
		
		Car c =new Car();
		c.name = "I10";
		c.color = "black";
		c.speed = 10;
		c.gearType ="Auto";
		
				
		Car c2 = new Car("I10","black",10,"Auto");
		c2.print();

	}
}
