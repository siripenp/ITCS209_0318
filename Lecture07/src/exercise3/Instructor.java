package exercise3;

public class Instructor extends Person {
	private int staffId;
	private double salary;
	
	public Instructor(String fullname, int id, double salary) {
		super(fullname);
		this.staffId = id;
		this.salary = salary;
	}
	
	// Override printInfo() method
	public void printInfo() {
		super.printInfo();
		System.out.println("Staff ID: " + this.staffId);
		System.out.println("Salary: " + this.salary);
	}
	
	public String toString() {
		return super.toString() + "\nStaff ID: " + staffId + "\nSalary: " + salary;
	}
	
	public int getStaffId() {
		return this.staffId;
	}
	
	public double applyRaise(double rate) {
		double raise = salary * (rate / 100.0);
		salary = salary + raise;
		return salary;
	}
}
