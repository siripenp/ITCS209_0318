package exercise;

public class Instructor {
	private String fullname;
	private int staffId;
	private double salary;
	
	public Instructor(String fullname, int id, double salary) {
		this.fullname = fullname;
		this.staffId = id;
		this.salary = salary;
	}
	
	public String getFullname() {
		return this.fullname;
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
