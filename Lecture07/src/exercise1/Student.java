package exercise1;

public class Student extends Person {
	
	private int studentId;
	private int credit;
	
	public Student(String fullname, int id, int credit) {
		super(fullname);
		this.studentId = id;
		this.credit = credit;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void addCredit(int c) {
		credit = credit + c;
	}
	
	public boolean isGraduated() {
		if(credit >= 60) 
			return true;
		else
			return false;
	}
	
}
