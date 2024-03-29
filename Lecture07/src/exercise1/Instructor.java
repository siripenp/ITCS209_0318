package exercise1;

public class Instructor extends Person {
	private int staffId;
	private double salary;
	
	public Instructor(String fullname, int id, double salary) {
		super(fullname);
		this.staffId = id;
		this.salary = salary;
	}
	
	// Override printInfo() method
	// YOUR CODE GOES HERE
	
	public int getStaffId() {
		return this.staffId;
	}
	
	public double applyRaise(double rate) {
		double raise = salary * (rate / 100.0);
		salary = salary + raise;
		return salary;
	}
	
	
}
