package basic;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
    
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the value of a:");
		int x = s.nextInt();
		System.out.println("Enter the value of b:");
		int z = s.nextInt();
		//Add ad= new Add();
		Add sum = new Add (x,z);
		sum.sum();
		sum.print();
		}

}
