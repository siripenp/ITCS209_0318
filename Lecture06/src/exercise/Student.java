package exercise;

public class Student {
	private String fullname;
	private int studentId;
	private int credit;
	
	public Student(String fullname, int id, int credit) {
		this.fullname = fullname;
		this.studentId = id;
		this.credit = credit;
	}
	
	public String getFullname() {
		return this.fullname;
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
