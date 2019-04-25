package arrayofobj;

import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the no of Employee:");
	      int n = scan.nextInt();
	      Employee[] emps = new Employee[n]; // to create empty array 

			for (int i = 0; i < emps.length; i++) {

				emps[i] = new Employee();  
				System.out.println("Enter id, name and salary for Employee: " + (i + 1));
				emps[i].setId(scan.nextInt());
				scan.nextLine(); // new line 
				emps[i].setName(scan.nextLine());
				emps[i].setSalary(scan.nextFloat());

			}
			
			System.out.println("Printing Array");
			
			for (int i = 0; i < emps.length; i++) {
				emps[i].print();
			}

	}
	
	
	
}
