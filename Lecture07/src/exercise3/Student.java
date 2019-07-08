package exercise3;

public class Student extends Person {
	
	private int studentId;
	private int credit;
	
	public Student(String fullname, int id, int credit) {
		super(fullname);
		this.studentId = id;
		this.credit = credit;
	}
	
	// Override printInfo() method
	public void printInfo() {
		super.printInfo();
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Credit: " + this.credit);
	}
	
	// Override toString() method
	public String toString() {
		return super.toString() + "\nStudent ID: " + studentId + "\nCredit: " + credit;
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
