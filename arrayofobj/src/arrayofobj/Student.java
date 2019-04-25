package arrayofobj;

public class Student {
	private int id;
	private String name;
	private float grade;
	 //private float exam;


//		public void getExam()  {
//			return;
//	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getGrade() {
		return grade;
	}


	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Grade=" + grade);
	}
}
