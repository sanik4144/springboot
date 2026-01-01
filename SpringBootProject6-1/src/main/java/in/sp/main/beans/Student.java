package in.sp.main.beans;

public class Student {
	private int rollno;
	private String name;
	private float marks;
	public Student(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}
