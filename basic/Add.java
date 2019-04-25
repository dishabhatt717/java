package basic;

public class Add {

	private int a;
	private int b;
	private int c;
	
	public Add(int a,int b) {
		
		this.a = a;
		this.b = b;
		
	}
	void sum (){
		this.c = a+b;
	}
	void print () {
		System.out.println("the sum is =" +c);
	}
	
	
	
}
