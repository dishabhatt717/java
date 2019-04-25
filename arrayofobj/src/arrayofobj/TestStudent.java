package arrayofobj;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter no of students:");
		int n = scan.nextInt();
		Student[] sts = new Student[n];

		for (int i = 0; i < sts.length; i++) {
			sts[i] = new Student();
			System.out.println("enter id, name, grade:" + (i + 1));

			sts[i].setId(scan.nextInt());
			scan.nextLine();
			sts[i].setName(scan.nextLine());
			sts[i].setGrade(scan.nextFloat());

		}
		System.out.println("Printing Array");
		for (int i = 0; i < sts.length; i++) {
			sts[i].print();
		
		}
	}
	}
