package in.sp.main.Users;

public class Student {
	private int stdId;
	private String name;
	private String email;
	private float marks;
	public Student(int stdId, String name, String email, float marks) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
