package abstractclass;

public class Circle extends Shape {
	float radius;

	public void calcArea() {

		area = 3.14f * radius * radius;
	}

	void print() {
		System.out.println("Radius" + radius);
		super.print();

	}

}
